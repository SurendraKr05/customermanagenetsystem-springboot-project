package com.jsp.customermanagmentsystem.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.jsp.customermanagmentsystem.entity.Customer;

@Repository
public class CustomerDao{

	@Autowired
	private CustomerRepository repository;
	
	public Customer  saveCustomer(Customer customer){
        return repository.save(customer);
    }

    public Customer updateCustomer(Customer customer){
		return repository.saveAndFlush(customer);
	}

    public List<Customer> getAllCustomerData(){
        return repository.findAll();
    }
    public Customer getCustomerDataById(int id){
        return repository.findById(id).orElse(new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
    }

    public Customer deleteCustomerDataById(int id){

    	Customer customer =getCustomerDataById(id);
        if(customer.getId()!=404){
            repository.deleteById(id);
        }
        return customer;
    }
	
	
}
