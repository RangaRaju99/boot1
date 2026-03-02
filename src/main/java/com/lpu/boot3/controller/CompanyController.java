package com.lpu.boot3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.boot3.entity.Company;
import com.lpu.boot3.exception.AgeInvalidException;
import com.lpu.boot3.service.CompanyService;


@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	
	 @PostMapping("/company")
	 public Company saveCompany(@RequestBody Company company) {
		   return companyService.saveCompany(company);
	 }
	 
	 
	 @RequestMapping("/companys/{id}")
	 public String addEmployeeToCompany(@PathVariable int id, @RequestParam List<Integer> eId) {
		  
		 companyService.addEmployeeToCompany(id, eId);
		    
		 return "added successfully";
	 }
	 
	 @GetMapping("/divide/{a}/{b}")
	 public String testException(@PathVariable int a, @PathVariable int b) {
		   return "res="+a/b;
	 }
	 
	 
	 @GetMapping("checkAge/{age}")
	 public String testAgeException(@PathVariable int age) {
		 
		    if(age<18) {
		    	  throw new AgeInvalidException("age invalid");
		    }
		   return "eligible to vote";
	 }
	 
	 
	 @GetMapping("/company/{id}")
	 public ResponseEntity<Company> findCompanyById(@PathVariable int id){
		 
		   Company comp=companyService.findCompany(id);
		   return new ResponseEntity<>(comp,HttpStatus.OK);
	 }
}
