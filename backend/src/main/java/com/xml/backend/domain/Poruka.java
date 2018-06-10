package com.xml.backend.domain;

public class Poruka {
	
	private String id;
    private String sadrzaj;
    private String posaljilac;
    private String primalac;
    
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
	public String getPosaljilac() {
		return posaljilac;
	}
	public void setPosaljilac(String posaljilac) {
		this.posaljilac = posaljilac;
	}
	public String getPrimalac() {
		return primalac;
	}
	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}
    
    

}
