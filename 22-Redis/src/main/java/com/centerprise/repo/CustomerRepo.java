package com.centerprise.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.centerprise.bean.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
