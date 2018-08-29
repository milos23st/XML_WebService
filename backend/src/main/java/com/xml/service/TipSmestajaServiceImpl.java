package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.TipSmestaja;
import com.xml.repository.TipSmestajaRepository;

@Service
public class TipSmestajaServiceImpl implements TipSmestajaService {
	
	@Autowired
	private TipSmestajaRepository repository;
	
	@Override
	public List<TipSmestaja> getAll() {
		
		return repository.findAll();
	}
	
	@Override
	public TipSmestaja findOne(Long id) {
		return repository.getOne(id);
	}

}
