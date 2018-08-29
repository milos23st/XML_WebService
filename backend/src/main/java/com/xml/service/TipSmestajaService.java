package com.xml.service;

import java.util.List;

import com.xml.backend.domain.TipSmestaja;

public interface TipSmestajaService {
	
	List<TipSmestaja> getAll();
	TipSmestaja findOne(Long id);
	

}
