package com.app;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.stream.JsonWriter;

public class TestGsonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (JsonWriter writer = new JsonWriter(new FileWriter("user2.json"))) {

	            // pretty print
	            writer.setIndent("  ");

	            writer.beginObject();                   // {
	            writer.name("name").value("mkyong");    // "name" : "mkyong"
	            writer.name("age").value(42);           // "age" : 42

	            writer.name("messages");                // "messages" :
	            writer.beginArray();                    // [
	            writer.value(1);                        // 1,
	            writer.value(2);                        // 2,
	            writer.value(3);                        // 3
	            writer.endArray();                      // ]

	            writer.endObject();                     // }
	            System.out.println(" Writing is completed ");

	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }

	}

}
