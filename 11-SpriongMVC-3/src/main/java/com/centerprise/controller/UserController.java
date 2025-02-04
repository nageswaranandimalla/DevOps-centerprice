package com.centerprise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.centerprise.bean.User;
import com.centerprise.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("user", new User());

		return "index";
	}

	/**
	 * To handle form submission
	 * 
	 * @param model
	 * @return
	 */
	@PostMapping("/user")
	public String handleSubmitBtn(@Valid @ModelAttribute User user,BindingResult result, Model model) 
	{

		System.out.println(user);
		
		//TODO: Store form data into database
		
		if(result.hasErrors())
		{
			return "index";
		}
		
		boolean saveUser=userService.saveUser(user);
		
		if(saveUser) {
		model.addAttribute("msg", "User Data Saved successfully...!!");
		}
		return "index";
	}
	
	@GetMapping("/users")
	public String viewUsers(Model model){
	
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		
		return "success";
	}
	

}
