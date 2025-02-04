package com.centerprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.centerprise.bean.Order;
import com.centerprise.constraints.KafkaConstants;


@RestController
public class OrderController {
    @Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	 @PostMapping(value="/order", consumes={ "Application/json"})
	public String placeOrder(@RequestBody Order order) {
		 
		  kafkaTemplate.send(KafkaConstants.TOPIC,order);
		 
		 return "Order Placed ";
	 }
}
