package com.xml.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.Smestaj;
import com.xml.repository.SmestajRepository;
@Service
public class SmestajServiceImpl implements SmestajService {
	@Autowired
    private SmestajRepository smestajRepository;


    public List<Smestaj> findAll(){
        List<Smestaj> smestaj = this.smestajRepository.findAll();
        return smestaj;
    }

    public Smestaj findOne(Long id){
        Smestaj smestaj = this.smestajRepository.getOne(id);
        return smestaj;
    }

    
    public Smestaj save(Smestaj smestaj){
        return  smestajRepository.save(smestaj);
    }

    

    
    public void delete(Long id) {
        this.smestajRepository.deleteById(id);
    }

	@Override
	public List<Smestaj> searchBynas(Long id) {
		List<Smestaj> smestaji = smestajRepository.findAll();
        List<Smestaj> pronadjeni = new ArrayList<Smestaj>();

        for(Smestaj s: smestaji) {
            if(s.getNaseljenoMesto().getId().equals(id)) {
                pronadjeni.add(s);
            }
        }
        return pronadjeni;
	}
}
