package com.centerprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	public MessageController() {
		System.out.println("Message Controller ......constructor");
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Spring Boot MVC APP1..!!");
		mav.setViewName("Home");

		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		// setting data in key-value format to access in view page
		mav.addObject("msg", "Welcome to Centerprise ....!!");

		// return view file name
		mav.setViewName("index");

		return mav;
	}
	
	@GetMapping("/email")
	public String getUserEmail(Model model) {
		
		model.addAttribute("data", "ashokitschool@gmail.com");
		
		return "index";
	}
	
	

}
