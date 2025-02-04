package com.centerprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.centerprise.entity.PersonEntity;
import com.centerprise.entity.PersonPKEntity;
import com.centerprise.repo.PersonRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		
		PersonRepo personRepo =context.getBean(PersonRepo.class);
		
		PersonPKEntity pk=new PersonPKEntity();
		pk.setAadhar(3343434L);
		pk.setPassport("k98237432");
		
		
		PersonEntity p=new PersonEntity();
		
		p.setEmail("abc.gmail.com");
		p.setName("abc");
		p.setPersonPk(pk);
		personRepo.save(p);
		
	}

}
