package com.lpu.boot3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.boot3.entity.Employee;
import com.lpu.boot3.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	 @Autowired
	private EmployeeService employeeService;
	 
	 
	 @PostMapping("/employee")
	 public Employee saveEmployee(@RequestBody Employee e) {
		     return employeeService.saveEmployee(e);
	 }
	 
	   
}
