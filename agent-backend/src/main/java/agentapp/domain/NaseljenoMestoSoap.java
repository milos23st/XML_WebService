package agentapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NaseljenoMestoSoap {
	@Id
	private Long id;
    private String naziv;
    private String pttBroj;
    private String drzava;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getPttBroj() {
		return pttBroj;
	}
	public void setPttBroj(String pttBroj) {
		this.pttBroj = pttBroj;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	} 
    
    

}
