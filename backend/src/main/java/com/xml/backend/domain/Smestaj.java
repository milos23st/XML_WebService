package com.xml.backend.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.xml.user.User;


@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Smestaj {
	@Id
	private Long id;
    private String naziv;
    private Integer kapacitet;
    @ManyToOne
    private NaseljenoMesto naseljenomesto; 
    private String opis;
	private String address;
	@OneToMany
	private List<Zauzetost> zauzeto;
    @OneToMany
    private List<Komentar> komentari;
    @OneToOne
    private User agent;
    @ManyToOne
    private Kategorija kategorija;
    @ManyToOne
    private TipSmestaja tipSmestaja;
    @OneToMany
	private Set<SmestajSlika> images = new HashSet<SmestajSlika>();
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<DodatnaUsluga> dodatneUsluge  = new HashSet<DodatnaUsluga>();
    @ManyToMany
    private List<Ocena> rating = new ArrayList<Ocena>();
    
	
	public TipSmestaja getTipSmestaja() {
		return tipSmestaja;
	}
	public void setTipSmestaja(TipSmestaja tipSmestaja) {
		this.tipSmestaja = tipSmestaja;
	}
	public List<Zauzetost> getZauzeto() {
		return zauzeto;
	}
	public void setZauzeto(List<Zauzetost> zauzeto) {
		this.zauzeto = zauzeto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
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
	
	public List<Komentar> getKomentari() {
		return komentari;
	}
	public void setKomentari(List<Komentar> komentari) {
		this.komentari = komentari;
	}
	public User getAgent() {
		return agent;
	}
	public void setAgent(User agent) {
		this.agent = agent;
	}
	public Kategorija getKategorija() {
		return kategorija;
	}
	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}
	public NaseljenoMesto getNaseljenoMesto() {
		return naseljenomesto;
	}
	public void setNaseljenoMesto(NaseljenoMesto naseljenoMesto) {
		this.naseljenomesto = naseljenoMesto;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<SmestajSlika> getImages() {
		return images;
	}
	public void setImages(Set<SmestajSlika> images) {
		this.images = images;
	}
	public Set<DodatnaUsluga> getDodatneUsluge() {
		return dodatneUsluge;
	}
	public void setDodatneUsluge(Set<DodatnaUsluga> dodatneUsluge) {
		this.dodatneUsluge = dodatneUsluge;
	}

	public List<Ocena> getRating() {
		return rating;
	}
	public void setRating(List<Ocena> rating) {
		this.rating = rating;
	}
	
    
    

}
