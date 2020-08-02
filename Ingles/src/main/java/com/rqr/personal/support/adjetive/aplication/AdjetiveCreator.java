package com.rqr.personal.support.adjetive.aplication;

import com.rqr.personal.support.adjetive.domain.Adjetive;

public interface AdjetiveCreator {

	public boolean create(Adjetive adjetive) throws AdjetiveError,AdjectiveAlreadyExists;

	public void setAdjetiveRepository(AdjetiveRepository adjetiveRepository);

}
