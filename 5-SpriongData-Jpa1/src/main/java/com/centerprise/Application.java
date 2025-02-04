package com.centerprise;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.centerprise.entity.UserEntity;
import com.centerprise.repo.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(Application.class, args);
		
		UserRepository repo=context.getBean(UserRepository.class);
		
		//UserEntity u=new UserEntity(103, "Ramu", "Male", 25, "India");
		//repo.save(u);
		
		/*
		UserEntity u2 = new UserEntity(102, "Raju", "Male", 40, "India");
		UserEntity u3 = new UserEntity(103, "John", "Male", 30, "USA");
		UserEntity u4 = new UserEntity(104, "Smith", "Male", 30, "Canada");

		repo.saveAll(Arrays.asList(u2, u3, u4));
		*/
		
		Iterable<UserEntity> findByAge = repo.findByAge(30);
		findByAge.forEach(user -> {
			System.out.println(user);
		});
		
		/*Optional<UserEntity> findById = repo.findById(105);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}else
		{
			System.out.println("Record Not found");
		}*/
		
		/*
		Iterable<UserEntity> allById = repo.findAllById(Arrays.asList(101,102,103,104,105));
		allById.forEach(user -> {
			System.out.println(user);
		});
		
		Iterable<UserEntity> findAll = repo.findAll();
		findAll.forEach(user -> {
			System.out.println(user);
		});*/
		
		/*long count = repo.count();
		System.out.println("Total Records in table :: "+ count);
		
		boolean existsById = repo.existsById(101);
		System.out.println("Record Presence with id - 101 :: " + existsById);
		
		repo.deleteById(104);
		
		repo.deleteAllById(Arrays.asList(102,103));
		*/
		
		
		
	}

}
