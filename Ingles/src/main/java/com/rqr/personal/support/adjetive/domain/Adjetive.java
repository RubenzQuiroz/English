package com.rqr.personal.support.adjetive.domain;

public class Adjetive {
	private int idAdjetive;
	private String adjetiveEnglish;
	private String adjetiveEspaniol;
	private String descripcion;

	public int getIdAdjetive() {
		return idAdjetive;
	}

	public void setIdAdjetive(int idAdjetive) {
		this.idAdjetive = idAdjetive;
	}

	public String getAdjetive_english() {
		return adjetiveEnglish;
	}

	public void setAdjetive_english(String adjetive_english) {
		this.adjetiveEnglish = adjetive_english;
	}

	public String getAdjetive_espaniol() {
		return adjetiveEspaniol;
	}

	public void setAdjetive_espaniol(String adjetive_espaniol) {
		this.adjetiveEspaniol = adjetive_espaniol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Adjetive [idAdjetive=" + idAdjetive + ", adjetive_english=" + adjetiveEnglish + ", adjetive_espaniol="
				+ adjetiveEspaniol + ", descripcion=" + descripcion + "]";
	}

}
