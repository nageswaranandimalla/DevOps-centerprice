package com.centerprise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	
	@GetMapping("/")
	public String homePage() {
		return "<h1> Landing On Home Page<h1>";
	}
	
	@GetMapping("/login")
	public String loginMessage() {
		return "<h1> Success fully login<h1>";
	}
	
	
	
	@GetMapping("/about")
	public String aboutMessage() {
		return "<h1> AboutUs page .............<h1>";
	}

}
