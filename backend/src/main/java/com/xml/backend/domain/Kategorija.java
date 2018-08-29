package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kategorija {
	@Id
	private Long id;
    private String naziv;
    
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
    
    
}
