package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

}
