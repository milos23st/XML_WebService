package com.xml.service.soap;

import java.util.List;

import javax.jws.WebService;

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


@WebService(targetNamespace="https://bezbednost/")
public interface SmestajServiceSoap {
	
	public List<TipSmestaja> findAllTypes();
	public List<Kategorija> findAllCategories();
	public List<DodatnaUsluga> findAllServices();
	public List<Smestaj> findAllAccomodations();
	public List<NaseljenoMesto> findAllNaseljenoMesto();
	public List<Rezervacija> findAllRezervacije();
	
	public Smestaj save(Smestaj acc);		
	public SmestajSlika saveSmestajSlika(SmestajSlika accImg);
	public Termin saveTermin(Termin term);

	public Smestaj findSmestajById(Long id);
	public SmestajSlika findSlikaById(Long id);
	public TipSmestaja findTipById(Long id);
	public Kategorija findKategorijaById(Long id);
	public DodatnaUsluga findDodatnaUslugaById(Long id);
	public Termin findTerminById(Long id);
	public Komentar findKomentarById(Long id);
	public NaseljenoMesto findNaseljenoMestoById(Long id);
	public Zauzetost findZauzetostById(Long id);
	
	public List<Smestaj> getSmestajeAgenta(Long id);

}
