package com.centerprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping("/greet")
	public String sayHello1() {
		return "Hello World1";
	}
	
	@GetMapping("/greet1")
	public String sayHello2() {
		return "Hello World2";
	}
	
	
	@GetMapping("/greet2")
	public String sayHello3() {
		return "Hello World3";
	}
	@GetMapping("/greet3")
	public String sayHello4() {
		return "Hello World4";
	}
	
	

}
