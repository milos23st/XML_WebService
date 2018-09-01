package agentapp.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class RezervacijaSoap {
	@Id
	@GeneratedValue
	private Long id;
    private Date datumDolaska;
    private Date datumOdlaska;
    @ManyToOne
    private SmestajSoap smestaj;
    private boolean izvrsena;
    private Integer cena;
    
    private Long user;
    
    
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
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
	
	public SmestajSoap getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(SmestajSoap smestaj) {
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
