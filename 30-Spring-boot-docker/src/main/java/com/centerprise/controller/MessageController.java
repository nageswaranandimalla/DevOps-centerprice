package com.centerprise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/msg")
	public String showMessage() {
		
		return " Welcome to docker example";
	}
	
}
