package agentapp.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;




@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class SmestajSoap {
	@Id
	@GeneratedValue
	private Long id;
    private String name;
    private Integer kapacitet;
    @ManyToOne
    private NaseljenoMestoSoap naseljenomesto; 
    private String opis;
	private String address;
	@OneToMany
	private List<ZauzetostSoap> zauzeto;
    @OneToMany
    private List<KomentarSoap> komentari;
    
    private Long agent;
    @ManyToOne
    private KategorijaSoap kategorija;
    @ManyToOne
    private TipSmestajaSoap tipSmestaja;
    @OneToMany
	private Set<SmestajSlikaSoap> images = new HashSet<SmestajSlikaSoap>();
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<DodatnaUslugaSoap> dodatneUsluge  = new HashSet<DodatnaUslugaSoap>();
    @ManyToMany
    private List<OcenaSoap> rating = new ArrayList<OcenaSoap>();
    @OneToMany
	private List<TerminSoap> termini = new ArrayList<TerminSoap>();
    
    
	
	public NaseljenoMestoSoap getNaseljenomesto() {
		return naseljenomesto;
	}
	public void setNaseljenomesto(NaseljenoMestoSoap naseljenomesto) {
		this.naseljenomesto = naseljenomesto;
	}
	public List<TerminSoap> getTermini() {
		return termini;
	}
	public void setTermini(List<TerminSoap> termini) {
		this.termini = termini;
	}
	public TipSmestajaSoap getTipSmestaja() {
		return tipSmestaja;
	}
	public void setTipSmestaja(TipSmestajaSoap tipSmestaja) {
		this.tipSmestaja = tipSmestaja;
	}
	public List<ZauzetostSoap> getZauzeto() {
		return zauzeto;
	}
	public void setZauzeto(List<ZauzetostSoap> zauzeto) {
		this.zauzeto = zauzeto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(Integer kapacitet) {
		this.kapacitet = kapacitet;
	}

	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public List<KomentarSoap> getKomentari() {
		return komentari;
	}
	public void setKomentari(List<KomentarSoap> komentari) {
		this.komentari = komentari;
	}
	public Long getAgent() {
		return agent;
	}
	public void setAgent(Long agent) {
		this.agent = agent;
	}
	public KategorijaSoap getKategorija() {
		return kategorija;
	}
	public void setKategorija(KategorijaSoap kategorija) {
		this.kategorija = kategorija;
	}
	public NaseljenoMestoSoap getNaseljenoMesto() {
		return naseljenomesto;
	}
	public void setNaseljenoMesto(NaseljenoMestoSoap naseljenoMesto) {
		this.naseljenomesto = naseljenoMesto;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<SmestajSlikaSoap> getImages() {
		return images;
	}
	public void setImages(Set<SmestajSlikaSoap> images) {
		this.images = images;
	}
	public Set<DodatnaUslugaSoap> getDodatneUsluge() {
		return dodatneUsluge;
	}
	public void setDodatneUsluge(Set<DodatnaUslugaSoap> dodatneUsluge) {
		this.dodatneUsluge = dodatneUsluge;
	}

	public List<OcenaSoap> getRating() {
		return rating;
	}
	public void setRating(List<OcenaSoap> rating) {
		this.rating = rating;
	}
	
    
    

}
