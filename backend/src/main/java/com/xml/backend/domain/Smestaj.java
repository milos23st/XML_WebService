package com.xml.backend.domain;

import java.util.List;



public class Smestaj {
	
	private String id;
    private String naziv;
    private Integer kapacitet;
    private String naseljeno_mesto; // referenca na naseljeno mesto u kom se nalazi
    private String opis;
    private List<String> slike;
    private List<Rezervacija> rezervacije;
    private List<Komentar> komentari;
    private String agent; //referenca na agenta koji je vlasnik smestaja
    private String tipSmestaja; //referenca na tip smestaja
    private String kategorijaSmestaja; //referenca na kategoriju smestaja
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public List<String> getSlike() {
		return slike;
	}
	public void setSlike(List<String> slike) {
		this.slike = slike;
	}
	public List<Rezervacija> getRezervacije() {
		return rezervacije;
	}
	public void setRezervacije(List<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}
	public List<Komentar> getKomentari() {
		return komentari;
	}
	public void setKomentari(List<Komentar> komentari) {
		this.komentari = komentari;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getTipSmestaja() {
		return tipSmestaja;
	}
	public void setTipSmestaja(String tipSmestaja) {
		this.tipSmestaja = tipSmestaja;
	}
	public String getKategorijaSmestaja() {
		return kategorijaSmestaja;
	}
	public void setKategorijaSmestaja(String kategorijaSmestaja) {
		this.kategorijaSmestaja = kategorijaSmestaja;
	}
    
    

}
