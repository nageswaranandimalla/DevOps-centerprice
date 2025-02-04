package com.centerprise.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centerprise.entity.PassportEntity;
import com.centerprise.entity.PersonEntity;
import com.centerprise.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public void saveDate() {
		PersonEntity person=new PersonEntity();
		
		person.setPersonName("Nageswara");
		person.setPersonGender("Male");
		
		PassportEntity passport=new PassportEntity();
		passport.setPassPortNum("k89237432");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		personRepo.save(person);
		
		
	}
	

}
