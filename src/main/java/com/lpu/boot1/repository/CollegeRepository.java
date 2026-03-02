package com.lpu.boot1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.boot1.entity.College;
import com.lpu.boot1.entity.Student;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer>{

	
	
}
