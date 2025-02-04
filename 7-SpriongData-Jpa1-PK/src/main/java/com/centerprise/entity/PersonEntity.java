package com.centerprise.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class PersonEntity {

	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonPKEntity getPersonPk() {
		return personPk;
	}

	public void setPersonPk(PersonPKEntity personPk) {
		this.personPk = personPk;
	}

	@EmbeddedId
	private PersonPKEntity personPk;
	
}
