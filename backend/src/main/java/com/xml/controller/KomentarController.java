package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xml.backend.domain.Komentar;
import com.xml.backend.domain.Smestaj;
import com.xml.service.KomentarService;
import com.xml.service.SmestajService;



@RestController
public class KomentarController {
	
	@Autowired
    private KomentarService komentariService;

    @Autowired
    private SmestajService smestajService;

    public KomentarController(KomentarService komentariService){
        this.komentariService = komentariService;
    }



    @RequestMapping(
            method = RequestMethod.GET,
            value ="/komentari",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Komentar>> getAll() {
        List<Komentar> komentari = komentariService.findAll();
        return new ResponseEntity<List<Komentar>>(komentari, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.GET,
            value ="/komentari/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Komentar> getKomentari(@PathVariable("id") String id) {
        Komentar komentari = this.komentariService.findOne(Long.parseLong(id));
        if(komentari == null){
            return new ResponseEntity<Komentar>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Komentar>(komentari, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/komentari/{idSmestaj}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Komentar> insertKomentar(@PathVariable ("idSmestaj") String id, @RequestBody Komentar komentari) throws Exception{
        Komentar createdKomentar  = this.komentariService.create(komentari);
        Smestaj s = smestajService.findOne(Long.parseLong(id));
        s.getKomentari().add(createdKomentar);
        smestajService.save(s);
        
        return new ResponseEntity<Komentar>(createdKomentar, HttpStatus.CREATED);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/komentari/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public ResponseEntity<Komentar> deleteKomentar(@PathVariable("id") String id){
        this.komentariService.delete(Long.parseLong(id));
        return new ResponseEntity<Komentar>(HttpStatus.NO_CONTENT);
    }

}
