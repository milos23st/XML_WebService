package com.xml.service;

import java.util.List;

import com.xml.backend.domain.Kategorija;

public interface KategorijaSmestajaService {
	
	List<Kategorija> getAll();
	Kategorija findOne(Long id);

}
