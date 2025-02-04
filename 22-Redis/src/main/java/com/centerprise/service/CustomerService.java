package com.centerprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.centerprise.bean.Customer;
import com.centerprise.repo.CustomerRepo;

@Service
public class CustomerService {

	   @Autowired
	  private CustomerRepo customerRepo;
	   
	   public Customer addCustomer(Customer customer)
		{
		   System.out.println(customer.toString());
			return customerRepo.save(customer);
		}
	   
	   public List<Customer> getAllCustomers(){
		   
		   List<Customer> allCustomer=new ArrayList<>();
		   
		   customerRepo.findAll().forEach(allCustomer::add);
		   return allCustomer;
	   }
	   
}
