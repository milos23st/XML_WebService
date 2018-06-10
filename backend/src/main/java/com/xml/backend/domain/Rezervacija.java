package com.xml.backend.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Rezervacija {
	
	private String id;
    private Date datumDolaska;
    private Date datumOdlaska;
    private String smestajNaziv;
    private String smestajId;
    private String korisnikId;
    private boolean izvrsena;
    private Integer cena;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDatumDolaska() {
		return datumDolaska;
	}
	public void setDatumDolaska(Date datumDolaska) {
		this.datumDolaska = datumDolaska;
	}
	public Date getDatumOdlaska() {
		return datumOdlaska;
	}
	public void setDatumOdlaska(Date datumOdlaska) {
		this.datumOdlaska = datumOdlaska;
	}
	public String getSmestajNaziv() {
		return smestajNaziv;
	}
	public void setSmestajNaziv(String smestajNaziv) {
		this.smestajNaziv = smestajNaziv;
	}
	public String getSmestajId() {
		return smestajId;
	}
	public void setSmestajId(String smestajId) {
		this.smestajId = smestajId;
	}
	public String getKorisnikId() {
		return korisnikId;
	}
	public void setKorisnikId(String korisnikId) {
		this.korisnikId = korisnikId;
	}
	public boolean isIzvrsena() {
		return izvrsena;
	}
	public void setIzvrsena(boolean izvrsena) {
		this.izvrsena = izvrsena;
	}
	public Integer getCena() {
		return cena;
	}
	public void setCena(Integer cena) {
		this.cena = cena;
	}
    
    

}
