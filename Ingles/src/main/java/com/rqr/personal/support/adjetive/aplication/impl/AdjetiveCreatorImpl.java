package com.rqr.personal.support.adjetive.aplication.impl;

import org.springframework.stereotype.Component;

import com.rqr.personal.support.adjetive.aplication.AdjectiveAlreadyExists;
import com.rqr.personal.support.adjetive.aplication.AdjetiveCreator;
import com.rqr.personal.support.adjetive.aplication.AdjetiveError;
import com.rqr.personal.support.adjetive.aplication.AdjetiveRepository;
import com.rqr.personal.support.adjetive.domain.Adjetive;

@Component("AdjetiveCreator")
public class AdjetiveCreatorImpl implements AdjetiveCreator {
	private AdjetiveRepository adjetiveRepository;

	@Override
	public boolean create(Adjetive adjetive) throws AdjetiveError {
		boolean state = false;
		try {
			Adjetive adjetiveFound = this.adjetiveRepository.findByAdjetiveEnglish(adjetive.getAdjetive_english());
			if (adjetiveFound == null) {
				this.adjetiveRepository.create(adjetive);
				state = true;
			} else {
				throw new AdjectiveAlreadyExists();
			}
		} catch (Exception e) {
			throw new AdjetiveError("Error al crear el adjetivo :" + e.getMessage());
		}
		return state;
	}

	@Override
	public void setAdjetiveRepository(AdjetiveRepository adjetiveRepository) {
		this.adjetiveRepository = adjetiveRepository;
	}

}
