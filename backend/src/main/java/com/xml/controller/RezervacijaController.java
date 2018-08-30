package com.xml.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xml.backend.domain.Rezervacija;
import com.xml.backend.domain.Smestaj;
import com.xml.backend.domain.Zauzetost;
import com.xml.service.RezervacijaService;
import com.xml.service.SmestajService;
import com.xml.service.UserService;
import com.xml.service.ZauzetostService;
import com.xml.user.User;




@RestController
public class RezervacijaController {
	
	@Autowired
	private RezervacijaService rezervacijaService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
    private SmestajService smestajService;
	
	@Autowired
	private ZauzetostService zauzetostService;
	
	@RequestMapping(
            method = RequestMethod.GET,
            value ="/rezervacija",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Rezervacija>> getAll() {
        List<Rezervacija> rezervacija = rezervacijaService.findAll();
        return new ResponseEntity<List<Rezervacija>>(rezervacija, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.GET,
            value ="/rezervacija/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Rezervacija> getRezervazija(@PathVariable("id") Long id) {
        Rezervacija rezervacija = this.rezervacijaService.findOne(id);
        if(rezervacija == null){
            return new ResponseEntity<Rezervacija>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Rezervacija>(rezervacija, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/rezervacija",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Rezervacija> insertRezervacija(@RequestParam(value = "smestaj", required = true) String idSmestaj, @RequestParam(value = "korisnik", required = true) String idKorisnik, @RequestBody Rezervacija rezervacija) throws Exception{

        rezervacija.setIzvrsena(false);
        Smestaj smestaj = smestajService.findOne(Long.parseLong(idSmestaj));
        System.out.println(smestaj.getId());
        rezervacija.setSmestaj(smestaj);
        User user = userService.findOne(Long.parseLong(idKorisnik));
        rezervacija.setUser(user);
        Rezervacija createdRezervacija  = this.rezervacijaService.create(rezervacija);
        Zauzetost zauz = new Zauzetost(createdRezervacija.getDatumDolaska(), createdRezervacija.getDatumOdlaska());
        smestaj.getZauzeto().add(zauz);
        zauzetostService.save(zauz);
        smestajService.save(smestaj);
        createdRezervacija.setSmestaj(smestaj);

        return new ResponseEntity<Rezervacija>(createdRezervacija, HttpStatus.CREATED);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/rezervacija/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Rezervacija> updateRezervacija(@PathVariable("id") String id, @RequestBody Rezervacija rezervacija) throws Exception{
        Rezervacija rezervacije = this.rezervacijaService.findOne(Long.parseLong(id));

        if(rezervacije == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Rezervacija updateRezervacija = this.rezervacijaService.update(rezervacija);
        if (updateRezervacija == null) {
            return new ResponseEntity<Rezervacija>(
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(updateRezervacija, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/rezervacija/{id}"
    )
    public ResponseEntity<Rezervacija> deleteRezervacija(@PathVariable("id") String id){
        Rezervacija rezervacija = rezervacijaService.findOne(Long.parseLong(id));
        Smestaj smestaj = smestajService.findOne(rezervacija.getSmestaj().getId());
        User korisnik = userService.findOne(rezervacija.getUser().getId());
        Rezervacija rezBrisanjeS = null;
        Rezervacija rezBrisanjeK = null;
        Zauzetost zauBrisanje = null;

        for(Zauzetost zau : smestaj.getZauzeto()) {
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(zau.getPocetak());
            cal2.setTime(rezervacija.getDatumDolaska());
            if(cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR)) {
                zauBrisanje = zau;
            }
        }

        smestaj.getZauzeto().remove(zauBrisanje);
        smestajService.save(smestaj);
        userService.save(korisnik);

        this.rezervacijaService.delete(Long.parseLong(id));
        return new ResponseEntity<Rezervacija>(HttpStatus.OK);
    }

}
