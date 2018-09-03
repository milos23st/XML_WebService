package com.xml.service;

import java.util.List;

import com.xml.backend.domain.TipSmestaja;

public interface TipSmestajaService {
	
	List<TipSmestaja> getAll();
	TipSmestaja findOne(Long id);
	TipSmestaja create(TipSmestaja ts);
	void delete(Long id);

}
