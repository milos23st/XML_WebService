package com.xml.backend.domain;

public class Komentar {
	
	private String id;
    private String sadrzaj;
    private String ime;
    private String smestajId;
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
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSmestajId() {
		return smestajId;
	}
	public void setSmestajId(String smestajId) {
		this.smestajId = smestajId;
	}
	public boolean isOdobren() {
		return odobren;
	}
	public void setOdobren(boolean odobren) {
		this.odobren = odobren;
	}
    
    

}
