package agentapp.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import agentapp.domain.DodatnaUslugaSoap;
import agentapp.domain.KategorijaSoap;
import agentapp.domain.KomentarSoap;
import agentapp.domain.NaseljenoMestoSoap;
import agentapp.domain.RezervacijaSoap;
import agentapp.domain.SmestajSlikaSoap;
import agentapp.domain.SmestajSoap;
import agentapp.domain.TerminSoap;
import agentapp.domain.TipSmestajaSoap;
import agentapp.domain.ZauzetostSoap;
import agentapp.dto.SmestajDto;
import agentapp.repository.DodatnaUslugaSoapRepository;
import agentapp.repository.KategorijaSoapRepository;
import agentapp.repository.KomentarSoapRepository;
import agentapp.repository.NaseljenoMestoSoapRepository;
import agentapp.repository.RezervacijaSoapRepository;
import agentapp.repository.SmestajSlikaSoapRepository;
import agentapp.repository.SmestajSoapRepository;
import agentapp.repository.TerminSoapRepository;
import agentapp.repository.TipSmestajaSoapRepository;
import agentapp.repository.ZauzetostSoapRepository;
import https.bezbednost.SmestajServiceSoap;
import https.bezbednost.SmestajSlika;
import https.bezbednost.Termin;
import https.bezbednost.TipSmestaja;
import https.bezbednost.UserServiceSoap;
import https.bezbednost.Zauzetost;
import https.bezbednost.DodatnaUsluga;
import https.bezbednost.Kategorija;
import https.bezbednost.Komentar;
import https.bezbednost.NaseljenoMesto;
import https.bezbednost.Rezervacija;
import https.bezbednost.Smestaj;


@Component
public class SoapSmestajService {
	
	@Autowired
	private SmestajSoapRepository smestajSoapRepository;
	
	@Autowired
	private TipSmestajaSoapRepository tipSmestajaSoapRepository;
	
	@Autowired
	private KategorijaSoapRepository kategorijaSoapRepository;
	
	@Autowired	
	private DodatnaUslugaSoapRepository dodatnaUslugaSoapRepository;
	
	@Autowired	
	private SmestajSlikaSoapRepository smestajSlikaSoapRepository;
	
	@Autowired
	private TerminSoapRepository terminSoapRepository;
	
	@Autowired
	private KomentarSoapRepository komentarSoapRepository;
	
	@Autowired
	private NaseljenoMestoSoapRepository naseljenoMestoSoapRepository;
	
	@Autowired
	private ZauzetostSoapRepository zauzetostSoapRepository;
	
	@Autowired
	private RezervacijaSoapRepository rezervacijaSoapRepository;
	
	public SmestajSoap save(SmestajDto s, Long agentId) throws MalformedURLException{
		URL url = new URL("http://localhost:8081/Service/smestajServiceSoap?wsdl");
		QName qname = new QName("https://bezbednost/", "SmestajService");
		Service service = Service.create(url, qname);
		SmestajServiceSoap smestajServiceSoap = service.getPort(SmestajServiceSoap.class);
		
		URL url1 = new URL("http://localhost:8081/Service/userServiceSoap?wsdl");
		QName qname1 = new QName("https://bezbednost/", "UserService");
		Service service1 = Service.create(url1, qname1);
		UserServiceSoap userServiceSoap = service1.getPort(UserServiceSoap.class);
		
		Smestaj smestaj = new Smestaj();
		smestaj.setName(s.getName());
		smestaj.setAddress(s.getAddress());
		smestaj.setKapacitet(s.getKapacitet());
		smestaj.setKategorija(smestajServiceSoap.findKategorijaById(s.getKategorija()));
		smestaj.setNaseljenomesto(smestajServiceSoap.findNaseljenoMestoById(s.getNaseljenomesto()));
		smestaj.setOpis(s.getOpis());
		smestaj.setTipSmestaja(smestajServiceSoap.findTipById(s.getTipSmestaja()));
		smestaj.setAgent(userServiceSoap.findOne(agentId));
		for(Long dodatna: s.getDodatneUsluge()) {
			smestaj.getDodatneUsluge().add(smestajServiceSoap.findDodatnaUslugaById(dodatna));
		}
		SmestajSoap local = new SmestajSoap();
		for(String image: s.getImages()) {
			SmestajSlikaSoap sss = new SmestajSlikaSoap();
			sss.setUrl(image);
			smestajSlikaSoapRepository.save(sss);
			SmestajSlika ss = new SmestajSlika();
			ss.setUrl(image);
			smestaj.getImages().add(ss);
			local.getImages().add(sss);
		}
		for(TerminSoap termin: s.getTermsSoap()) { 
			terminSoapRepository.save(termin);
			Termin t = new Termin();
			t.setPrice(termin.getCena());
			t.setMesec(termin.getMesec());
			smestaj.getTerms().add(t);
			local.getTermini().add(termin);
			
		}
		
		smestajServiceSoap.save(smestaj);
		
		local.setAddress(s.getAddress());
		local.setAgent(agentId);
		local.setKapacitet(s.getKapacitet());
		local.setKategorija(kategorijaSoapRepository.getOne(s.getKategorija()));
		local.setName(s.getName());
		local.setNaseljenoMesto(naseljenoMestoSoapRepository.getOne(s.getNaseljenomesto()));
		local.setOpis(s.getOpis());
		local.setTipSmestaja(tipSmestajaSoapRepository.getOne(s.getTipSmestaja()));
		smestajSoapRepository.save(local);
		
		return local;
}
	public void synchonise() throws MalformedURLException, ParseException{
		URL url = new URL("http://localhost:8081/Service/smestajServiceSoap?wsdl");
		QName qname = new QName("https://bezbednost/", "SmestajService");
		Service service = Service.create(url, qname);
		SmestajServiceSoap smestajServiceSoap = service.getPort(SmestajServiceSoap.class);
		
		URL url1 = new URL("http://localhost:8081/Service/userServiceSoap?wsdl");
		QName qname1 = new QName("https://bezbednost/", "UserService");
		Service service1 = Service.create(url1, qname1);
		UserServiceSoap userServiceSoap = service1.getPort(UserServiceSoap.class);
				
		List<SmestajSoap> accSoaps = smestajSoapRepository.findAll();
		for(SmestajSoap accSoap : accSoaps){
			accSoap.setDodatneUsluge(new HashSet<DodatnaUslugaSoap>());
		}		
	    smestajSoapRepository.deleteAll();
		tipSmestajaSoapRepository.deleteAll();
		kategorijaSoapRepository.deleteAll();
		dodatnaUslugaSoapRepository.deleteAll();
		smestajSlikaSoapRepository.deleteAll();
		terminSoapRepository.deleteAll();
		komentarSoapRepository.deleteAll();
		naseljenoMestoSoapRepository.deleteAll();
		zauzetostSoapRepository.deleteAll();
		
		List<TipSmestaja> accTypes = smestajServiceSoap.findAllTypes();
		for(TipSmestaja accType : accTypes){
			TipSmestajaSoap accTypeSoap = new TipSmestajaSoap();
			accTypeSoap.setId(accType.getId());;
			accTypeSoap.setName(accType.getName());
			tipSmestajaSoapRepository.save(accTypeSoap);
		}
		List<Kategorija> kategorije = smestajServiceSoap.findAllCategories();
		for(Kategorija k: kategorije) {
			KategorijaSoap katSoap = new KategorijaSoap();
			katSoap.setId(k.getId());
			katSoap.setName(k.getName());
			kategorijaSoapRepository.save(katSoap);
		}
		
		List<DodatnaUsluga> usluge = smestajServiceSoap.findAllServices();
		for(DodatnaUsluga u: usluge) {
			DodatnaUslugaSoap usluga = new DodatnaUslugaSoap();
			usluga.setId(u.getId());
			usluga.setName(u.getName());
			dodatnaUslugaSoapRepository.save(usluga);
		}
		List<NaseljenoMesto> mesta = smestajServiceSoap.findAllNaseljenoMesto();
		for(NaseljenoMesto m: mesta) {
			NaseljenoMestoSoap mesto = new NaseljenoMestoSoap();
			mesto.setDrzava(m.getDrzava());
			mesto.setId(m.getId());
			mesto.setNaziv(m.getNaziv());
			mesto.setPttBroj(m.getPttBroj());
			naseljenoMestoSoapRepository.save(mesto);
		}
		
		List<Smestaj> smestaji = smestajServiceSoap.findAllAccomodations();
		for(Smestaj s: smestaji) {
			SmestajSoap smestaj = new SmestajSoap();
			smestaj.setAddress(s.getAddress());
			smestaj.setAgent(s.getAgent().getId());
			smestaj.setId(s.getId());
			for(DodatnaUslugaSoap usluga: dodatnaUslugaSoapRepository.findAll()) {
				for(DodatnaUsluga u: s.getDodatneUsluge()) {
					if(u.getId().equals(usluga.getId())) {
						smestaj.getDodatneUsluge().add(dodatnaUslugaSoapRepository.findById(u.getId()).get());
					}
				}
			}
			for(Komentar komentar : s.getKomentari()){
				Komentar k = smestajServiceSoap.findKomentarById(Long.parseLong(komentar.getId()));
				KomentarSoap cs = new KomentarSoap();
				cs.setId(k.getId());
				cs.setOdobren(k.isOdobren());
				cs.setSadrzaj(k.getSadrzaj());
				cs.setUser(k.getUser().getId());
				smestaj.getKomentari().add(cs);
				komentarSoapRepository.save(cs);
			}
			for(Zauzetost zauzetost: s.getZauzeto()) {
				Zauzetost z = smestajServiceSoap.findZauzetostById(zauzetost.getId());
				ZauzetostSoap zs = new ZauzetostSoap();
				zs.setId(z.getId());
				zs.setPocetak(z.getPocetak().toGregorianCalendar().getTime());
				zs.setKraj(z.getKraj().toGregorianCalendar().getTime());
				List<ZauzetostSoap> l = new ArrayList<ZauzetostSoap>();
				smestaj.setZauzeto(l);
				smestaj.getZauzeto().add(zs);
				zauzetostSoapRepository.save(zs);
				
			}
			
			
			smestajSoapRepository.save(smestaj);
			
		}
		List<Rezervacija> rezervacije = smestajServiceSoap.findAllRezervacije();
		for(Rezervacija r: rezervacije) {
			RezervacijaSoap rezSoap = new RezervacijaSoap();
			rezSoap.setId(r.getId());
			rezSoap.setCena(r.getCena());
			rezSoap.setDatumDolaska(r.getDatumDolaska().toGregorianCalendar().getTime());
			rezSoap.setDatumOdlaska(r.getDatumOdlaska().toGregorianCalendar().getTime());
			rezSoap.setIzvrsena(r.isIzvrsena());
			rezSoap.setSmestaj(smestajSoapRepository.findById(r.getSmestaj().getId()).get());
			rezSoap.setUser(r.getUser().getId());
			rezervacijaSoapRepository.save(rezSoap);
		}
		
		
	}
	
	
	
}
