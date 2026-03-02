package com.lpu.boot3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.boot3.entity.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer>{
	
	

}
