package com.centerprise.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPKEntity {
	
	private Long aadhar;
	private String passport;
	
	
	public PersonPKEntity() {
		super();
	}
	public PersonPKEntity(Long aadhar, String passport) {
		super();
		this.aadhar = aadhar;
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "PersonPKEntity [aadhar=" + aadhar + ", passport=" + passport + "]";
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	

}
