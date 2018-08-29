package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	

}
