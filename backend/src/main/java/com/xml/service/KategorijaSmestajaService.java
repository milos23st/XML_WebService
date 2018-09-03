package com.xml.service;

import java.util.List;

import com.xml.backend.domain.Kategorija;
import com.xml.backend.domain.TipSmestaja;

public interface KategorijaSmestajaService {
	
	List<Kategorija> getAll();
	Kategorija findOne(Long id);
	Kategorija create(Kategorija ts);
	void delete(Long id);

}
