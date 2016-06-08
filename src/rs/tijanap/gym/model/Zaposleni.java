package rs.tijanap.gym.model;

import javax.validation.constraints.Pattern;

public class Zaposleni {
	
	/**
	 *  ne sme da sadrzi nijednu digit CIFRU
	 **/
	@Pattern(regexp="[^0-9]*")	
	private String ime;
	private String prezime;
	
	public Zaposleni() {
		super();
	}

	public Zaposleni(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
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
	
	

}
