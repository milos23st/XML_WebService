package com.xml.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xml.backend.domain.DodatnaUsluga;
import com.xml.backend.domain.NaseljenoMesto;
import com.xml.backend.domain.Smestaj;
import com.xml.backend.domain.Zauzetost;
import com.xml.service.DodatnaUslugaService;
import com.xml.service.NaseljenoMestoService;
import com.xml.service.SmestajService;





@Controller
public class SmestajController {
	
	@Autowired
    private SmestajService smestajService;
	
	@Autowired
	private NaseljenoMestoService naseljenoMestoService;
	
	@Autowired
	private DodatnaUslugaService dodatnaUslugaService;
	
	@RequestMapping(method = RequestMethod.GET, value ="/smestaj", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<List<Smestaj>> getAll() {
		
		return new ResponseEntity<List<Smestaj>>(smestajService.findAll(), HttpStatus.OK);
		
	}
	@RequestMapping(
            method = RequestMethod.GET,
            value = "/smestaj/search",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
	public ResponseEntity<List<Smestaj>> simpleSearch(@RequestParam(value = "datumDo", required = false) String datumDo1,@RequestParam(value = "datumOd", required = false) String datumOd1,@RequestParam(value = "mesto", required = false) String mesto, @RequestParam(value = "brOsoba", required = false) Integer brOsoba, @RequestParam(value = "dodatna", required = false) String[] dodatna,
            @RequestParam(value = "tip", required = false) String[] tip, @RequestParam(value = "kategorija", required = false) String[] kategorija) {
			List<Smestaj> ukloniti = new ArrayList<Smestaj>();
			String naziv = mesto;
			System.out.println(naziv);
			Integer kapacitet = brOsoba;
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date datumOd = null;
			Date datumDo = null;
			try {
			datumOd = format.parse(datumOd1);
			System.out.println(datumOd);
			datumDo = format.parse(datumDo1);
			} catch (ParseException e) {
			e.printStackTrace();
			}
			//samo preuzeti parametre i proveriti da li je parameters.get()==null
			
			List<Smestaj> pronadjeniOut = new ArrayList<Smestaj>();
			List<Smestaj> pronadjeni = new ArrayList<Smestaj>();
			List<NaseljenoMesto> mesta = naseljenoMestoService.search(naziv);
			
			for(NaseljenoMesto nas : mesta) {
			List<Smestaj> smestajMesto = smestajService.searchBynas(nas.getId());
			for(Smestaj s: smestajMesto) {
			if(s.getKapacitet() == kapacitet) {
			boolean preklapanje = false;
			for(Zauzetost z : s.getZauzeto()) {
			if(z.getPocetak().before(datumDo) && z.getKraj().after(datumOd)) {
			preklapanje = true;
			}
			}
			if(!preklapanje) {
			pronadjeni.add(s);
			
			}
			}
			}
			}
			
			if(kategorija != null) {
			for(Smestaj s: pronadjeni) {
			boolean kat_prosla = false;
			for(String k: kategorija) {
			if(s.getKategorija().getId().equals(Long.parseLong(k))) {
			kat_prosla = true;
			}
			}
			
			if(!kat_prosla) {
			ukloniti.add(s);
			}
			}
			for(Smestaj u : ukloniti) {
			pronadjeni.remove(u);
			}
			ukloniti.clear();
			}
			
			if(tip != null) {
			for(Smestaj s: pronadjeni) {
			boolean tip_prosao = false;
			for(String t: tip) {
			if(s.getTipSmestaja().getId().equals(Long.parseLong(t))) {
			tip_prosao = true;
			}
			}
			if(!tip_prosao) {
			ukloniti.add(s);
			}
			}
			for(Smestaj u : ukloniti) {
			pronadjeni.remove(u);
			}
			ukloniti.clear();
			}
			
			if(dodatna != null) {
			List<DodatnaUsluga> dodatne = new ArrayList<DodatnaUsluga>();
			for(String d : dodatna) {
			dodatne.add(dodatnaUslugaService.findOne(Long.parseLong(d)));
			}
			
			for(Smestaj s: pronadjeni) {
			for(DodatnaUsluga d : dodatne) {
			boolean dodatna_prosla = false;
			for(DodatnaUsluga p : s.getDodatneUsluge()) {
			if(p.getId().equals(d.getId())) {
			dodatna_prosla = true;
			}
			}
			if(!dodatna_prosla) {
			ukloniti.add(s);
			break;
			}
			
			}
			}
			
			for(Smestaj u: ukloniti) {
			pronadjeni.remove(u);
			}
			
			ukloniti.clear();
			}
			
			
			
			return new ResponseEntity<List<Smestaj>>(pronadjeni,HttpStatus.OK);
			}

	
}
