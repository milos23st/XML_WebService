package com.xml.service.soap;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.backend.domain.Kategorija;
import com.xml.backend.domain.Komentar;
import com.xml.backend.domain.NaseljenoMesto;
import com.xml.backend.domain.Rezervacija;
import com.xml.backend.domain.Smestaj;
import com.xml.backend.domain.SmestajSlika;
import com.xml.backend.domain.Termin;
import com.xml.backend.domain.TipSmestaja;
import com.xml.backend.domain.Zauzetost;
import com.xml.repository.DodatnaUslugaRepository;
import com.xml.repository.KategorijaSmestajaRepository;
import com.xml.repository.KomentarRepository;
import com.xml.repository.NaseljenoMestoRepository;
import com.xml.repository.RezervacijaRepository;
import com.xml.repository.SmestajRepository;
import com.xml.repository.SmestajSlikaRepository;
import com.xml.repository.TerminRepository;
import com.xml.repository.TipSmestajaRepository;
import com.xml.repository.UserRepository;
import com.xml.repository.ZauzetostRepository;
import com.xml.user.User;
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
	
	@Autowired
	private NaseljenoMestoRepository naseljenoMestoRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ZauzetostRepository zauzetostRepository;
	
	@Autowired
	private RezervacijaRepository rezervacijaRepository;

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
		User u = userRepository.getOne(acc.getAgent().getId());
		for(SmestajSlika s: acc.getImages()) {
		smestajSlikaRepository.save(s);
		}
		for(Termin t: acc.getTerms()) {
			terminRepository.save(t);
		}
		acc.setAgent(u);
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
		return smestajRepository.findById(id).get();
	}

	@Override
	public SmestajSlika findSlikaById(Long id) {
		return smestajSlikaRepository.findById(id).get();
	}

	@Override
	public TipSmestaja findTipById(Long id) {
		return tipSmestajaRepository.findById(id).get();
	}

	@Override
	public Kategorija findKategorijaById(Long id) {
		return kategorijaSmestajaRepository.findById(id).get();
	}

	@Override
	public DodatnaUsluga findDodatnaUslugaById(Long id) {
		return dodatnaUslugaRepository.findById(id).get();
	}

	@Override
	public Termin findTerminById(Long id) {
		return terminRepository.findById(id).get();
	}

	@Override
	public Komentar findKomentarById(Long id) {
		return komentarRepository.findById(id).get();
	}

	@Override
	public List<Smestaj> getSmestajeAgenta(Long id) {
		return smestajRepository.findByAgent(id);
	}

	@Override
	public NaseljenoMesto findNaseljenoMestoById(Long id) {
		return naseljenoMestoRepository.findById(id).get();
	}

	@Override
	public List<NaseljenoMesto> findAllNaseljenoMesto() {
		return naseljenoMestoRepository.findAll();
	}

	@Override
	public Zauzetost findZauzetostById(Long id) {
		return zauzetostRepository.findById(id).get();
	}

	@Override
	public List<Rezervacija> findAllRezervacije() {
		return rezervacijaRepository.findAll();
	}

}
