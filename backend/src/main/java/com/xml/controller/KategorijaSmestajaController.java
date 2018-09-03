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

import com.xml.backend.domain.Kategorija;
import com.xml.service.KategorijaSmestajaService;

@RestController
public class KategorijaSmestajaController {
	
	@Autowired
	private KategorijaSmestajaService kategorijaSmestajaService;
	
	@RequestMapping(method = RequestMethod.GET, value ="/kategorije", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Kategorija>> getAll() {
        List<Kategorija> kategorije = kategorijaSmestajaService.getAll();
        return new ResponseEntity<List<Kategorija>>(kategorije, HttpStatus.OK);
    }
	 @RequestMapping(
	            method = RequestMethod.GET,
	            value ="/kategorija/{id}",
	            produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    public ResponseEntity<Kategorija> getKategorija(@PathVariable("id") String id) {
	        Kategorija kategorija = this.kategorijaSmestajaService.findOne(Long.parseLong(id));
	        if(kategorija == null){
	            return new ResponseEntity<Kategorija>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Kategorija>(kategorija, HttpStatus.OK);
	    }


	    @RequestMapping(
	            method = RequestMethod.POST,
	            value = "/kategorija",
	            consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    public ResponseEntity<Kategorija> insertKategorija(@RequestBody Kategorija kategorija) throws Exception{
	        Kategorija createdKategorija  = this.kategorijaSmestajaService.create(kategorija);
	        return new ResponseEntity<Kategorija>(createdKategorija, HttpStatus.CREATED);
	    }


	    @RequestMapping(
	            method = RequestMethod.PUT,
	            value = "/kategorija/{id}",
	            consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE
	    )
	    public ResponseEntity<Kategorija> updateKategorija(@PathVariable("id") String id, @RequestBody Kategorija kategorija) throws Exception{
	        Kategorija kategorije = this.kategorijaSmestajaService.findOne(Long.parseLong(id));

	        if(kategorije == null){
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	        Kategorija updateKategorija = this.kategorijaSmestajaService.create(kategorija);
	        if (updateKategorija == null) {
	            return new ResponseEntity<Kategorija>(
	                    HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	        return new ResponseEntity<>(updateKategorija, HttpStatus.OK);
	    }


	    @RequestMapping(
	            method = RequestMethod.DELETE,
	            value = "/kategorija/{id}"
	    )
	    public ResponseEntity<Kategorija> deleteKategorija(@PathVariable("id") String id){
	        this.kategorijaSmestajaService.delete(Long.parseLong(id));
	        return new ResponseEntity<Kategorija>(HttpStatus.NO_CONTENT);
	    }
	

}
