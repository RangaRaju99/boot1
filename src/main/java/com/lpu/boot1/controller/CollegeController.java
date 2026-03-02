package com.lpu.boot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.boot1.entity.College;
import com.lpu.boot1.entity.Student;
import com.lpu.boot1.service.CollegeService;

@RestController
@RequestMapping("/lpu")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;

	@PostMapping("/college")
	public String saveCollege(@RequestBody College college) {
	   collegeService.saveCollege(college);
	   return "data saved";
	}
	
	@GetMapping("/college/{id}")
	public College fetchStudentById(@PathVariable int id) {
		 return collegeService.findCollegeById(id);
	}
	
	
	@DeleteMapping("/college")
	public String deleteStudent(@RequestBody College college) {
		   collegeService.deleteCollege(college);
		   return "college deleted";
	}
	
	
	@GetMapping("/college")
	public List<College> findAllCollege(){
		 return collegeService.findAllCollege();
	}
	
	@PostMapping("/colleges")
	public List<College> saveAllColleges(@RequestBody List<College> list){
		
		 return collegeService.saveAll(list);
	}
	
	@DeleteMapping("/colleges/{id}")
	public String deleteCollegeById(@PathVariable int id) {
		
		  collegeService.deleteById(id);
		   return "college deleted by id";
	}
}
