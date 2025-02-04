package com.centerprise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_MASTER")

public class UserEntity {
	
	@Id
	@Column(name = "USER_ID")
	private Integer userid;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_GENDER")
	private String gender;

	@Column(name = "USER_AGE")
	private Integer age;

	@Column(name = "USER_COUNTRY")
	private String country;
	
	

	public UserEntity() {
		super();
	}



	public UserEntity(Integer userid, String username, String gender, Integer age, String country) {
		super();
		this.userid = userid;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}
	
	

	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", gender=" + gender + ", age=" + age
				+ ", country=" + country + "]";
	}



	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
