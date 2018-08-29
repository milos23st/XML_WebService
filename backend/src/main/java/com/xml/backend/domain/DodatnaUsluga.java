package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DodatnaUsluga {
	@Id
	private Long id;
    private String name;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return name;
	}
	public void setNaziv(String naziv) {
		this.name = naziv;
	}
    
    

}
