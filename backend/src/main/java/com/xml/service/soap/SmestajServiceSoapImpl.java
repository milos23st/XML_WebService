package com.xml.service.soap;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.backend.domain.Kategorija;
import com.xml.backend.domain.Komentar;
import com.xml.backend.domain.Smestaj;
import com.xml.backend.domain.SmestajSlika;
import com.xml.backend.domain.Termin;
import com.xml.backend.domain.TipSmestaja;
import com.xml.repository.DodatnaUslugaRepository;
import com.xml.repository.KategorijaSmestajaRepository;
import com.xml.repository.KomentarRepository;
import com.xml.repository.SmestajRepository;
import com.xml.repository.SmestajSlikaRepository;
import com.xml.repository.TerminRepository;
import com.xml.repository.TipSmestajaRepository;
@Service
@WebService(targetNamespace="https://bezbednost/", serviceName="SmestajService", endpointInterface="com.xml.service.soap.SmestajServiceSoap")
public class SmestajServiceSoapImpl implements SmestajServiceSoap{
	
	@Autowired
	private SmestajRepository smestajRepository;
	
	@Autowired
	private SmestajSlikaRepository smestajSlikaRepository;
	
	@Autowired
	private TipSmestajaRepository tipSmestajaRepository;
	
	@Autowired
	private KategorijaSmestajaRepository kategorijaSmestajaRepository;
	
	@Autowired
	private DodatnaUslugaRepository dodatnaUslugaRepository;
	
	@Autowired
	private TerminRepository terminRepository;
	
	@Autowired
	private KomentarRepository komentarRepository;

	@Override
	public List<TipSmestaja> findAllTypes() {
		return tipSmestajaRepository.findAll();
	}

	@Override
	public List<Kategorija> findAllCategories() {
		return kategorijaSmestajaRepository.findAll();
	}

	@Override
	public List<DodatnaUsluga> findAllServices() {
		return dodatnaUslugaRepository.findAll();
	}

	@Override
	public List<Smestaj> findAllAccomodations() {
		return smestajRepository.findAll();
	}

	@Override
	public Smestaj save(Smestaj acc) {
		return smestajRepository.save(acc);
	}

	@Override
	public SmestajSlika saveSmestajSlika(SmestajSlika accImg) {
		return smestajSlikaRepository.save(accImg);
	}

	@Override
	public Termin saveTermin(Termin term) {
		return terminRepository.save(term);
	}

	@Override
	public Smestaj findSmestajById(Long id) {
		return smestajRepository.getOne(id);
	}

	@Override
	public SmestajSlika findSlikaById(Long id) {
		return smestajSlikaRepository.getOne(id);
	}

	@Override
	public TipSmestaja findTipById(Long id) {
		return tipSmestajaRepository.getOne(id);
	}

	@Override
	public Kategorija findKategorijaById(Long id) {
		return kategorijaSmestajaRepository.getOne(id);
	}

	@Override
	public DodatnaUsluga findDodatnaUslugaById(Long id) {
		return dodatnaUslugaRepository.getOne(id);
	}

	@Override
	public Termin findTerminById(Long id) {
		return terminRepository.getOne(id);
	}

	@Override
	public Komentar findKomentarById(Long id) {
		return komentarRepository.getOne(id);
	}

	@Override
	public List<Smestaj> getSmestajeAgenta(Long id) {
		return smestajRepository.findByAgent(id);
	}

}
