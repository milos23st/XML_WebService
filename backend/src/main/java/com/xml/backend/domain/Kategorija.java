package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kategorija {
	@Id
	private String id;
    private String naziv;
    
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
    
    
}
