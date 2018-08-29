package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.xml.user.User;

@Entity
public class Poruka {
	@Id
	@GeneratedValue
	private Long id;
    private String sadrzaj;
    @ManyToOne
    private User posaljilac;
    @ManyToOne
    private User primalac;
    
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getPosaljilac() {
		return posaljilac;
	}
	public void setPosaljilac(User posaljilac) {
		this.posaljilac = posaljilac;
	}
	public User getPrimalac() {
		return primalac;
	}
	public void setPrimalac(User primalac) {
		this.primalac = primalac;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	
    
    

}
