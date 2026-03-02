package com.lpu.boot1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.boot1.entity.Student;
import com.lpu.boot1.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		 return repository.save(student);
	}
	
	public Student findStudentById(int id) {
		  Optional<Student> optional=repository.findById(id);
		  if(optional.isPresent()) {
			  return optional.get();
		  }
		  return null;
	}
	
	public void deleteStudent(Student student) {
		 repository.delete(student);
	}
	
	public List<Student> findAllStudent(){
		   return repository.findAll();
	}
	
	public void deleteById(int id) {
		  repository.deleteById(id);
	}
	
	public List<Student> saveAll(List<Student> list){
		  return repository.saveAll(list);
	}
	
	  
	
	
}
