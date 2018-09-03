package com.xml.backend.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.xml.user.User;



@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Komentar {
	@Id
	private String id;
    private String sadrzaj;
    @ManyToOne(fetch = FetchType.EAGER)
	private User user;


    private boolean odobren;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isOdobren() {
		return odobren;
	}
	public void setOdobren(boolean odobren) {
		this.odobren = odobren;
	}
	public Komentar(String id, String sadrzaj, boolean odobren) {
		super();
		this.id = id;
		this.sadrzaj = sadrzaj;
		this.odobren = odobren;
	}
	
	
	
    
    

}
