package com.lpu.boot3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot3.entity.Employee;
import com.lpu.boot3.repository.EmployeeRepository;


@Service
public class EmployeeService {

	 @Autowired
	private EmployeeRepository employeeRepo;
	 
	 public Employee saveEmployee(Employee e) {
		  return employeeRepo.save(e);
	 }
}
