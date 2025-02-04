package com.centerprise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centerprise.bean.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
