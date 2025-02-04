package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.app.Sample1;
import com.example.demo.repo.SampleRemo;
import com.example.demo.service.SampleService;

import oracle.com.app.Abc;
import oracle.com.app.ExternalInfo;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","oracle.com.app"})
public class Application {

	public static void main(String[] args) {
		//It is creating container
		ConfigurableApplicationContext context =
		SpringApplication.run(Application.class, args);
		
		System.out.println("Main Class");
		//Sample s=new Sample();
		Sample s=context.getBean(Sample.class);
		Sample1 s1=context.getBean(Sample1.class);
		SampleService s2=context.getBean(SampleService.class);
		SampleRemo s3=context.getBean(SampleRemo.class);
		ExternalInfo s4=context.getBean(ExternalInfo.class);
		Abc a=context.getBean(Abc.class);
	}

}
