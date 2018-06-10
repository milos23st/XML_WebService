package com.xml.backend.domain;

import java.util.List;

public class Ocena {
	
	private String id;
    private Integer ocena;
    private String smestaj;
    private List<String> korisnici;
    
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
	public String getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(String smestaj) {
		this.smestaj = smestaj;
	}
	public List<String> getKorisnici() {
		return korisnici;
	}
	public void setKorisnici(List<String> korisnici) {
		this.korisnici = korisnici;
	}
    
    

}
