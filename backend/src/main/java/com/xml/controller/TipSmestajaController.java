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

import com.xml.backend.domain.TipSmestaja;
import com.xml.service.TipSmestajaService;


@RestController
public class TipSmestajaController {
	
	@Autowired
	private TipSmestajaService tipSmestajaService;
	
	@RequestMapping(method = RequestMethod.GET, value ="/tipovi", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipSmestaja>> getAll() {
        List<TipSmestaja> tipovi = tipSmestajaService.getAll();
        return new ResponseEntity<List<TipSmestaja>>(tipovi, HttpStatus.OK);
    }
	@RequestMapping(
            method = RequestMethod.GET,
            value ="/tipsmestaja/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<TipSmestaja> getTipsmestaja(@PathVariable("id") String id) {
        TipSmestaja tipsmestaja = this.tipSmestajaService.findOne(Long.parseLong(id));
        if(tipsmestaja == null){
            return new ResponseEntity<TipSmestaja>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TipSmestaja>(tipsmestaja, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.POST,
            value = "/tipsmestaja",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<TipSmestaja> insertTipsmestaja(@RequestBody TipSmestaja tipsmestaja) throws Exception{
        TipSmestaja createdTipsmestaja  = this.tipSmestajaService.create(tipsmestaja);
        return new ResponseEntity<TipSmestaja>(createdTipsmestaja, HttpStatus.CREATED);
    }


    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/tipsmestaja/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<TipSmestaja> updateTipsmestaja(@PathVariable("id") String id, @RequestBody TipSmestaja tipsmestaja) throws Exception{
        TipSmestaja tipovi = this.tipSmestajaService.findOne(Long.parseLong(id));

        if(tipovi == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        TipSmestaja updateTipsmestaja = this.tipSmestajaService.create(tipsmestaja);
        if (updateTipsmestaja == null) {
            return new ResponseEntity<TipSmestaja>(
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(updateTipsmestaja, HttpStatus.OK);
    }


    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/tipsmestaja/{id}"
    )
    public ResponseEntity<TipSmestaja> deleteTipsmestaja(@PathVariable("id") String id){
        this.tipSmestajaService.delete(Long.parseLong(id));
        return new ResponseEntity<TipSmestaja>(HttpStatus.NO_CONTENT);
    }

}
