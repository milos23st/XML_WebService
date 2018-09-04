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

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.service.DodatnaUslugaService;


@RestController
public class DodatnaUslugaController {

    @Autowired
    private DodatnaUslugaService dodatnaUslugaService;

    @RequestMapping(method = RequestMethod.GET, value ="/dodatneusluge", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DodatnaUsluga>> getAll() {
        List<DodatnaUsluga> usluge = dodatnaUslugaService.getAll();
        return new ResponseEntity<List<DodatnaUsluga>>(usluge, HttpStatus.OK);
    }
    
    @RequestMapping(
            method = RequestMethod.GET,
            value ="/dodatneusluge/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<DodatnaUsluga> getDodatneUsluge(@PathVariable("id") String id) {
        DodatnaUsluga dusluga = this.dodatnaUslugaService.findOne(Long.parseLong(id));
        if(dusluga == null){
            return new ResponseEntity<DodatnaUsluga>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<DodatnaUsluga>(dusluga, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/dodatneusluge",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<DodatnaUsluga> insertDodatnaUsluga(@RequestBody DodatnaUsluga dusluga) throws Exception{
        DodatnaUsluga createdDusluga  = this.dodatnaUslugaService.create(dusluga);
        return new ResponseEntity<DodatnaUsluga>(createdDusluga, HttpStatus.CREATED);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/dodatneusluge/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<DodatnaUsluga> updateDodatneUsluge(@PathVariable("id") String id, @RequestBody DodatnaUsluga dusluga) throws Exception{
        DodatnaUsluga dusluge = this.dodatnaUslugaService.findOne(Long.parseLong(id));

        if(dusluge == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        DodatnaUsluga updateDodatnaUsluga = this.dodatnaUslugaService.create(dusluga);
        if (updateDodatnaUsluga == null) {
            return new ResponseEntity<DodatnaUsluga>(
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(updateDodatnaUsluga, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/dodatneusluge/{id}"
    )
    public ResponseEntity<DodatnaUsluga> deleteDodatnaUsluga(@PathVariable("id") String id){
        this.dodatnaUslugaService.delete(Long.parseLong(id));
        return new ResponseEntity<DodatnaUsluga>(HttpStatus.NO_CONTENT);
    }
}