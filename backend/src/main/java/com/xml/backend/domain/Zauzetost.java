package com.xml.backend.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Zauzetost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date pocetak;
    private Date kraj;
    public Zauzetost() {}
    public Zauzetost(Date dat_pocetak, Date dat_kraj) {
        this.pocetak = dat_pocetak;
        this.kraj = dat_kraj;
    }
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
