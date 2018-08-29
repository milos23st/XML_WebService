package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.Kategorija;
import com.xml.repository.KategorijaSmestajaRepository;

@Service
public class KategorijaSmestajaServiceImpl implements KategorijaSmestajaService {
	
	@Autowired
	private KategorijaSmestajaRepository repository;

	@Override
	public List<Kategorija> getAll() {

		return repository.findAll();
	}

	@Override
	public Kategorija findOne(Long id) {
		
		return repository.getOne(id);
	}

}
