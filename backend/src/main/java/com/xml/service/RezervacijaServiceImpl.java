package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.Rezervacija;
import com.xml.repository.RezervacijaRepository;


@Service
public class RezervacijaServiceImpl implements RezervacijaService {
	
	@Autowired
    private RezervacijaRepository rezervacijaRepository;
	
	@Override
	public List<Rezervacija> findAll() {
		
		return rezervacijaRepository.findAll();
	}

	@Override
	public Rezervacija findOne(Long id) {
		
		return rezervacijaRepository.getOne(id);
	}

	@Override
	public Rezervacija create(Rezervacija rezervacija) {

		return rezervacijaRepository.save(rezervacija);
	}

	@Override
	public Rezervacija update(Rezervacija rezervacija) throws Exception {
		Rezervacija rezervacijaUpdt = this.rezervacijaRepository.getOne(rezervacija.getId());

        if(rezervacijaUpdt == null){
            throw new Exception("Nije pronadjena rezervacija.");
        }

        rezervacijaUpdt.setDatumDolaska(rezervacija.getDatumDolaska());
        rezervacijaUpdt.setDatumOdlaska(rezervacija.getDatumOdlaska());


        Rezervacija updateRezervacija = this.rezervacijaRepository.save(rezervacijaUpdt);
        return updateRezervacija;
	}

	@Override
	public void delete(Long id) {
		rezervacijaRepository.deleteById(id);
		
	}

}
