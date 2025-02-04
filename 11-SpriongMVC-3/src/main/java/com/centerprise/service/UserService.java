package com.centerprise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centerprise.bean.User;
import com.centerprise.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public boolean saveUser(User user)
	{
		user=userRepo.save(user);
		return user.getUserId() > 0 ;
	}
	
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}

}
