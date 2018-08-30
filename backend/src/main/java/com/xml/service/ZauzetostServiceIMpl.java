package com.xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.Zauzetost;
import com.xml.repository.ZauzetostRepository;

@Service
public class ZauzetostServiceIMpl implements ZauzetostService {

	@Autowired
	private ZauzetostRepository zauzetostRepository;
	
	@Override
	public Zauzetost save(Zauzetost z) {
		return zauzetostRepository.save(z);
	}

}
