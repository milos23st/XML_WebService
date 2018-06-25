package com.xml.backend.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.xml.user.User;


@Entity
public class Smestaj {
	@Id
	private Long id;
    private String naziv;
    private Integer kapacitet;
    private String naseljeno_mesto; 
    private String opis;
    @OneToMany
    private List<Komentar> komentari;
    @OneToOne
    private User agent;
    @ManyToOne
    private Kategorija kategorija;
    
	
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
	public String getNaseljeno_mesto() {
		return naseljeno_mesto;
	}
	public void setNaseljeno_mesto(String naseljeno_mesto) {
		this.naseljeno_mesto = naseljeno_mesto;
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
	
    
    

}
