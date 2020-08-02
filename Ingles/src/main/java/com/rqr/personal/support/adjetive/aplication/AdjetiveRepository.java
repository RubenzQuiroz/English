package com.rqr.personal.support.adjetive.aplication;

import com.rqr.personal.support.adjetive.domain.Adjetive;

public interface AdjetiveRepository {
	
	public void create(Adjetive adjetive) throws AdjetiveError;
	
	public void update(Adjetive adjetive) throws AdjetiveError;
	
	public void delete(Adjetive adjetive) throws AdjetiveError;
	
	public Adjetive findById(int id) throws AdjetiveError;
	
	public Adjetive findByAdjetiveEnglish(String adjetiveEnglish) throws AdjetiveError;
}
