package com.xml.service;

import java.util.List;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.backend.domain.TipSmestaja;


public interface DodatnaUslugaService {
	
	List<DodatnaUsluga> getAll();
	DodatnaUsluga findOne(Long id);
	DodatnaUsluga create(DodatnaUsluga ts);
	void delete(Long id);

}
