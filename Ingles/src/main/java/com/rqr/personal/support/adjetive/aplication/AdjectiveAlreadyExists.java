package com.rqr.personal.support.adjetive.aplication;

import java.io.Serializable;

public class AdjectiveAlreadyExists extends RuntimeException implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6585002632711592950L;
	
	public AdjectiveAlreadyExists() {
		super("El Adjetivo ya existe");
	}

}
