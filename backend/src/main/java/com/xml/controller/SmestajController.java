package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xml.backend.domain.Smestaj;
import com.xml.service.SmestajService;





@Controller
public class SmestajController {
	
	@Autowired
    private SmestajService smestajService;
	
	@RequestMapping(method = RequestMethod.GET, value ="/smestaj", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<Smestaj>> getAll() {
		
		return new ResponseEntity<List<Smestaj>>(smestajService.findAll(), HttpStatus.OK);
		
	}

	
}
