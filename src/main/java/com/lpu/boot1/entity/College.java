package com.lpu.boot1.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {

	@Id
	private int id;
	
	private String name;
	private String location;
	
	@OneToMany(mappedBy="college", cascade=CascadeType.ALL)
	private List<Student> studentList=new ArrayList<>();
	
	
	
	

	public College() {
		super();
	}

	public College(int id, String name, String location, List<Student> studentList) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.studentList = studentList;
	}
	
	public void addStudent(Student std) {
		studentList.add(std);
		std.setCollege(this);
	}
	
	public void addStudents(List<Student> list) {
		  studentList.addAll(list);
		  for(Student std:list) {
			    std.setCollege(this);
		  }
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
}
