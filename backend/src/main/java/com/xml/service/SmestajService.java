package com.xml.service;

import java.util.List;

import com.xml.backend.domain.Smestaj;

public interface SmestajService {
	
	public List<Smestaj> findAll();
	
	public Smestaj findOne(Long id); 
	
	public Smestaj save(Smestaj smestaj);
	
	public List<Smestaj> searchBynas(Long id);
	
	

}
