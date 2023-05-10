package com.jsp.customermanagmentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.customermanagmentsystem.entity.Customer;
import com.jsp.customermanagmentsystem.repository.CustomerDao;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao dao;
	
	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}

	public Customer updateCustomer(Customer customer){
		return dao.updateCustomer(customer);
	}

	public List <Customer> getAllCustomerData(){
        return dao.getAllCustomerData();
    }


	public Customer getCustomerDataById(int id){
		return dao.getCustomerDataById(id);
     
	}

	public Customer deleteCustomerDataById(int id){
		return dao.deleteCustomerDataById(id);
	}

}
