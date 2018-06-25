package com.xml.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.xml.backend.domain.Poruka;
import com.xml.backend.domain.Rezervacija;
@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
    private String ime;
    private String prezime;
    private String email;
    @Column(length = 255)
    private String password;
    private String telefon;
    private String adresa;
    @OneToMany
    private List<Rezervacija> rezervacije;
    @OneToMany
    private List<Poruka> poruke;
    private boolean aktivan;
    @ManyToOne(optional = false)
	private Role role;
    
    public User() {}
    
    public User(User user) {
        this.ime = user.getIme();
        this.prezime = user.getPrezime();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.telefon = user.getTelefon();
        this.adresa = user.getAdresa();
        this.rezervacije = user.getRezervacije();
        this.poruke = user.getPoruke();
        this.aktivan = user.isAktivan();
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String lozinka) {
		this.password = lozinka;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public List<Rezervacija> getRezervacije() {
		return rezervacije;
	}
	public void setRezervacije(List<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}
	
	public List<Poruka> getPoruke() {
		return poruke;
	}

	public void setPoruke(List<Poruka> poruke) {
		this.poruke = poruke;
	}

	public boolean isAktivan() {
		return aktivan;
	}
	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
    
    

}
