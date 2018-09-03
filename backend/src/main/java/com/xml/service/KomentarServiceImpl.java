package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.Komentar;
import com.xml.repository.KomentarRepository;

@Service
public class KomentarServiceImpl implements KomentarService {

	@Autowired
	private KomentarRepository repository;
	
	@Override
	public List<Komentar> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Komentar findOne(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Komentar create(Komentar komentar) {
		return repository.save(komentar);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
