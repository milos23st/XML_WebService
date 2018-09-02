package agentapp.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import agentapp.domain.DodatnaUslugaSoap;
import agentapp.domain.KategorijaSoap;
import agentapp.domain.KomentarSoap;
import agentapp.domain.NaseljenoMestoSoap;
import agentapp.domain.OcenaSoap;
import agentapp.domain.SmestajSlikaSoap;
import agentapp.domain.TerminSoap;
import agentapp.domain.TipSmestajaSoap;
import agentapp.domain.ZauzetostSoap;


public class SmestajDto {
	
	@Id
	private Long id;
    private String name;
    private Integer kapacitet;
    private Long naseljenomesto; 
    private String opis;
	private String address;
    private Long agent;
    private Long kategorija;
    private Long tipSmestaja;
	private Set<String> images = new HashSet<String>();
    private Set<Long> dodatneUsluge  = new HashSet<Long>();
    private List<TerminSoap> termsSoap;
	public SmestajDto(Long id, String name, Integer kapacitet, Long naseljenomesto, String opis, String address,
			Long agent, Long kategorija, Long tipSmestaja, Set<String> images, Set<Long> dodatneUsluge) {
		super();
		this.id = id;
		this.name = name;
		this.kapacitet = kapacitet;
		this.naseljenomesto = naseljenomesto;
		this.opis = opis;
		this.address = address;
		this.agent = agent;
		this.kategorija = kategorija;
		this.tipSmestaja = tipSmestaja;
		this.images = images;
		this.dodatneUsluge = dodatneUsluge;
	}
	public SmestajDto() {}
	public Long getId() {
		return id;
	}
	
	public List<TerminSoap> getTermsSoap() {
		return termsSoap;
	}
	public void setTermsSoap(List<TerminSoap> termsSoap) {
		this.termsSoap = termsSoap;
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
	public Long getNaseljenomesto() {
		return naseljenomesto;
	}
	public void setNaseljenomesto(Long naseljenomesto) {
		this.naseljenomesto = naseljenomesto;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getAgent() {
		return agent;
	}
	public void setAgent(Long agent) {
		this.agent = agent;
	}
	public Long getKategorija() {
		return kategorija;
	}
	public void setKategorija(Long kategorija) {
		this.kategorija = kategorija;
	}
	public Long getTipSmestaja() {
		return tipSmestaja;
	}
	public void setTipSmestaja(Long tipSmestaja) {
		this.tipSmestaja = tipSmestaja;
	}
	public Set<String> getImages() {
		return images;
	}
	public void setImages(Set<String> images) {
		this.images = images;
	}
	public Set<Long> getDodatneUsluge() {
		return dodatneUsluge;
	}
	public void setDodatneUsluge(Set<Long> dodatneUsluge) {
		this.dodatneUsluge = dodatneUsluge;
	}
    
    

}
