package agentapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class PorukaSoap {
	@Id
	@GeneratedValue
	private Long id;
    private String sadrzaj;
    private Long posaljilac;
    private Long primalac;
    
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPosaljilac() {
		return posaljilac;
	}
	public void setPosaljilac(Long posaljilac) {
		this.posaljilac = posaljilac;
	}
	public Long getPrimalac() {
		return primalac;
	}
	public void setPrimalac(Long primalac) {
		this.primalac = primalac;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	
    
    

}
