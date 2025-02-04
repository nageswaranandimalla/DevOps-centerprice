package com.centerprise.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.centerprise.bean.Customer;
import com.centerprise.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService  service;
	
	@PostMapping(value="/create", consumes="application/json")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	
	@GetMapping(value="/customers")
	public List<Customer> getListOfCustomer()
	{
		 return service.getAllCustomers();
	}
}
