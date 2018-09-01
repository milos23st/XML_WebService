package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Termin {
	@Id
	@GeneratedValue
	private Long id;
	private Integer mesec;
	private int cena;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getMesec() {
		return mesec;
	}
	public void setMesec(Integer mesec) {
		this.mesec = mesec;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	 
	 
}
