package com.xml.backend.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ocena {
	@Id
	private String id;
    private Integer ocena;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getOcena() {
		return ocena;
	}
	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}

    

}
