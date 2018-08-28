package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.service.DodatnaUslugaService;


@RestController
public class DodatnaUslugaController {

    @Autowired
    private DodatnaUslugaService dodatnaUslugaService;

    @RequestMapping(method = RequestMethod.GET, value ="/dodatneUsluge", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DodatnaUsluga>> getAll() {
        List<DodatnaUsluga> usluge = dodatnaUslugaService.getAll();
        return new ResponseEntity<List<DodatnaUsluga>>(usluge, HttpStatus.OK);
    }
}