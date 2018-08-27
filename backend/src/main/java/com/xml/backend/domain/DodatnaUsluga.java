package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DodatnaUsluga {
	@Id
	private String id;
    private String name;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNaziv() {
		return name;
	}
	public void setNaziv(String naziv) {
		this.name = naziv;
	}
    
    

}
