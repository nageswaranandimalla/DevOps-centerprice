package com.centerprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryParamDemo {
	
	@GetMapping("/enquiry")
	public String getInfo(@RequestParam("course") String course, 
						 @RequestParam("trainer")String trainer, 
						 Model model) {
		
		System.out.println("Course :: "+ course);
		System.out.println("Trainer :: "+ trainer);

		model.addAttribute("msg", ""+course+"  "+trainer+"Contact :- n.n.sarma@gmail.com");
		
		return "index";
	}
	
	@GetMapping("/course/{cname}/info")
	public String getCourseInfo(@PathVariable("cname") String cname, Model model) {

		String msgTxt = cname + " New Batch Starts Next Week..!!";

		model.addAttribute("msg", msgTxt);

		return "index";
	}

}
