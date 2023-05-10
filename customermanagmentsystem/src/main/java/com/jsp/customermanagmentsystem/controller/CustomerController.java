package com.jsp.customermanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.customermanagmentsystem.entity.Customer;
import com.jsp.customermanagmentsystem.service.CustomerService;
@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@PostMapping(value="/customer")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer cust) {
		return service.saveCustomer(cust);
	}

	@PutMapping(value="/customer/{id}")
	public @ResponseBody  Customer updateCustomer(@RequestBody Customer customer){
		return service.updateCustomer(customer);
	}

	@GetMapping(value="/customer")
	public @ResponseBody List<Customer> getAllCustomerData(){
        return service.getAllCustomerData();
    }
	
	@GetMapping(value="/customer/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id){
		return service.getCustomerDataById(id);
	}

	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id") int id){
		return service.deleteCustomerDataById(id);
	} 

}
