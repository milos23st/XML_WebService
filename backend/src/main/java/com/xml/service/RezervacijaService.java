package com.xml.service;

import java.util.List;

import com.xml.backend.domain.Rezervacija;



public interface RezervacijaService {
	List<Rezervacija> findAll();
    Rezervacija findOne(Long id);
    Rezervacija create(Rezervacija rezervacija);
    Rezervacija update(Rezervacija rezervacija) throws Exception;
    void delete(Long id);
}
