package com.centerprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;

	
	@GetMapping("/welcome2")
	public String getWelcomeMsg2() {
     String port=env.getProperty("server.port");
		
		String msg="Welcome to CenterPrice Soluations......2    " + port;
		
		return msg;

	}
	

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
     String port=env.getProperty("server.port");
		
		String msg="Welcome to CenterPrice Soluations......   " + port;
		
		return msg;

	}
	
	

	@GetMapping("/welcome1")
	public String getWelcomeMsg1() {
     String port=env.getProperty("server.port");
		
		String msg="Welcome to CenterPrice Soluations......1" + port;
		
		return msg;

	}
	

}
