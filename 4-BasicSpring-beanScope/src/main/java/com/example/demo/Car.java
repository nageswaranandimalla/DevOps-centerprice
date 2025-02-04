package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Car {
	
	//Type1
	/*@Autowired
	private Engine eng;
	*/
	/*private Engine eng;
	// Type 2
	@Autowired
	public void setEng(Engine eng) {
		this.eng = eng;
	}*/

	  // Type3
	private Engine eng;

	 @Autowired
    public Car(Engine eng){
        this.eng = eng;
        System.out.println("Car :: Constructor");
    }
	
	public void drive() {
		//eng=new Engine(); Not correct
		int start = eng.start();
		if (start >= 1) {
			System.out.println("Journey Started....");
		}
	}

}
