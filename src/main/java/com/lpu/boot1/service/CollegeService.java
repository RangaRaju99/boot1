package com.lpu.boot1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot1.entity.College;
import com.lpu.boot1.entity.Student;
import com.lpu.boot1.repository.CollegeRepository;

@Service
public class CollegeService {

	 @Autowired
	 private CollegeRepository collrepository;
	 
	 public College saveCollege(College college) {
		 List<Student> st=college.getStudentList();
		     college.addStudents(st);
		 return collrepository.save(college);
	}
	
	public College findCollegeById(int id) {
		  Optional<College> optional=collrepository.findById(id);
		  if(optional.isPresent()) {
			  return optional.get();
		  }
		  return null;
	}
	
	public void deleteCollege(College college) {
		 collrepository.delete(college);
	}
	
	public List<College> findAllCollege(){
		   return collrepository.findAll();
	}
	
	public void deleteById(int id) {
		  collrepository.deleteById(id);
	}
	
	public List<College> saveAll(List<College> list){
		  return collrepository.saveAll(list);
	}
}
