package com.rqr.personal.support.adjetive.aplication;

import java.io.Serializable;

public class AdjetiveError extends RuntimeException implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7975477078139788465L;

	public AdjetiveError(String message) {
		super(message);
	}

}
