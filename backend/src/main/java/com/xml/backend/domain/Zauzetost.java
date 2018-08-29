package com.xml.backend.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Zauzetost {
	@Id
	private Long id;
	private Date pocetak;
    private Date kraj;
    
	public Date getPocetak() {
		return pocetak;
	}
	public void setPocetak(Date pocetak) {
		this.pocetak = pocetak;
	}
	public Date getKraj() {
		return kraj;
	}
	public void setKraj(Date kraj) {
		this.kraj = kraj;
	}
    
    
}
