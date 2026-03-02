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

import com.lpu.boot1.entity.Student;
import com.lpu.boot1.service.StudentService;

@RestController
@RequestMapping("/lpu")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student fetchStudentById(@PathVariable int id) {
		 return studentService.findStudentById(id);
	}
	
	
	@DeleteMapping("/student")
	public String deleteStudent(@RequestBody Student student) {
		   studentService.deleteStudent(student);
		   return "student deleted";
	}
	
	
	@GetMapping("/student")
	public List<Student> findAllStudents(){
		 return studentService.findAllStudent();
	}
	
	@PostMapping("/students")
	public List<Student> saveAllStudents(@RequestBody List<Student> list){
		
		 return studentService.saveAll(list);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudentById(@PathVariable int id) {
		
		  studentService.deleteById(id);
		   return "student deleted by id";
	}
}
