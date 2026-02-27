package com.lpu.boot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.boot1.entity.Student;

@RestController
public class MyController { // browser accepts only GET requests

	@GetMapping("/hi")
	public String get() {
		return "byeee";
	}

	@GetMapping("/takeData")  // 👉 Query parameters are ALWAYS String in URL
	public String takeData(@RequestParam int id, @RequestParam String name) {
		return id + "  " + name;
	}
	
	@GetMapping("/takeData/{id}")
	public String takeDataTo(@PathVariable int id) {
		return id+"";
	}
	
	@GetMapping("/takeData/{id}/{name}")
	public String takeDataTo(@PathVariable int id, @PathVariable String name) {
		return id+" "+name;
	}
	
	@GetMapping("/takeData5")
	public String takeData5(@RequestHeader int id, @RequestHeader String name) {
		 return id+" "+name;
	}
	
	@GetMapping("/student")
	public String getStudent(@RequestBody Student s) {
		return ""+s;
	}
	
	@GetMapping("/student1")
	public Student getStudent1(@RequestBody Student s) {
		return s;
	}
	
	
}
