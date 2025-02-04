package com.centerprise.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.centerprise.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{

	// select * from user_master where user_country=?;
		public List<UserEntity> findByCountry(String cname);

		// select * from user_master where user_age=?;
		public List<UserEntity> findByAge(Integer age);

	
	
}
