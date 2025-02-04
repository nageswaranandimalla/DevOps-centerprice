package com.centerprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centerprise.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	   @Autowired
	   private WelcomeApiClient apiClient;
	   
	   @GetMapping("/greet")
	   public String getGreetMessage() {
		   
		   String greeResponse =" Good Morning Greet API ";
		   String welcomeResponse= apiClient.invokeWelcomeApi();
		   
		   return greeResponse +" |  "+welcomeResponse ;
	   }
	   
}
