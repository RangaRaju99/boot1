package com.lpu.boot3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot3.entity.Company;
import com.lpu.boot3.entity.Employee;
import com.lpu.boot3.repository.CompanyRepository;
import com.lpu.boot3.repository.EmployeeRepository;

@Service
public class CompanyService {

	 @Autowired
	private CompanyRepository companyRepo;
	 
	 
	 @Autowired
	private EmployeeRepository employeeRepo;
	 
	 
	 public Company saveCompany(Company company) {
		    
		  company.getEmployees().forEach((e)->e.setCompany(company));
		  return companyRepo.save(company);
	 }
	 
	 public void addEmployeeToCompany(int cId, List<Integer> eId) {
		 
		 Company c1=companyRepo.findById(cId).orElse(null);
		    for(int k:eId) {
		    	      Employee e1=employeeRepo.findById(k).orElse(null);
		    	      e1.setCompany(c1);
		    }
		    
		    companyRepo.save(c1);
	 }
	 
	 public Company findCompany(int id) {
		   return companyRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("no id"));
	 }
	 
}
