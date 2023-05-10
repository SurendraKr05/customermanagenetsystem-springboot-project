package com.jsp.customermanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.customermanagmentsystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
