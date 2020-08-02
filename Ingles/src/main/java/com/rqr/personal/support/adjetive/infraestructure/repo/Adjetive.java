package com.rqr.personal.support.adjetive.infraestructure.repo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AFT_AUX_TRANSACCION")
public class Adjetive {
	@Id
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

	public String getAdjetiveEnglish() {
		return adjetiveEnglish;
	}

	public void setAdjetiveEnglish(String adjetiveEnglish) {
		this.adjetiveEnglish = adjetiveEnglish;
	}

	public String getAdjetiveEspaniol() {
		return adjetiveEspaniol;
	}

	public void setAdjetiveEspaniol(String adjetiveEspaniol) {
		this.adjetiveEspaniol = adjetiveEspaniol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
