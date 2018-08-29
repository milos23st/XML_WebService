package com.xml.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.NaseljenoMesto;
import com.xml.repository.NaseljenoMestoRepository;
@Service
public class NaseljenoMestoServiceImpl implements NaseljenoMestoService {
	
	@Autowired
	private NaseljenoMestoRepository naseljenoMestoRepository;

	@Override
	public NaseljenoMesto findOne(Long id) {
		return naseljenoMestoRepository.getOne(id);
	}

	@Override
	public NaseljenoMesto insert(NaseljenoMesto nas) {
		return naseljenoMestoRepository.save(nas);
	}

	@Override
	public List<NaseljenoMesto> search(String naziv) {
		List<NaseljenoMesto> mesta = naseljenoMestoRepository.findAll();
        List<NaseljenoMesto> pronadjeni = new ArrayList<NaseljenoMesto>();

        for(NaseljenoMesto nas : mesta) {
            if(nas.getNaziv().toLowerCase().contains(naziv.toLowerCase())) {
                pronadjeni.add(nas);
            }
        }

        return pronadjeni;
    }
	

}
