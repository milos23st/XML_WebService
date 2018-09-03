package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.repository.DodatnaUslugaRepository;
@Service
public class DodatnaUslugaServiceImpl implements DodatnaUslugaService {

	@Autowired
	private DodatnaUslugaRepository repository;
	
	@Override
	public List<DodatnaUsluga> getAll() {
		
		return repository.findAll();
	}

	@Override
	public DodatnaUsluga findOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public DodatnaUsluga create(DodatnaUsluga ts) {
		return repository.save(ts);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
