package com.xml.backend.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xml.user.User;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Rezervacija {
	@Id
	@GeneratedValue
	private Long id;
    private Date datumDolaska;
    private Date datumOdlaska;
    @ManyToOne
    private Smestaj smestaj;
    private boolean izvrsena;
    private Integer cena;
    @ManyToOne
    private User user;
    
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	public Smestaj getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(Smestaj smestaj) {
		this.smestaj = smestaj;
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
