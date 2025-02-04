package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
		Car c1=context.getBean(Car.class);
		c1.drive();
		
		/*Car c2=context.getBean(Car.class);
		Car c3=context.getBean(Car.class);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());*/
		
		
		
	}

}
