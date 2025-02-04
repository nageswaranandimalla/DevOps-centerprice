package com.app;

import java.io.Serializable;

public class User {
	
	public User() {
		super();
	}
	public User(Integer id, String name, String gender, Long phno) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phno = phno;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", phno=" + phno + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	private Integer id;
	private String name;
	private String gender;
	private Long phno;


}
