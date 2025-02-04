package com.app;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJson {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		convertJsonToObj();
		convertObjToJson();
	
	}
	
	
	public static void convertJsonToObj() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(new File("user.json"), User.class);
		System.out.println(user);
	}
	
	
	public static void convertObjToJson() throws Exception {

		User u = new User(102, "Ramana", "Male", 123456l);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("user1.json"), u);

		System.out.println("Java Object converted to Json...!!");

	}


}
