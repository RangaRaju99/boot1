package com.lpu.boot3.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ArithmeticException.class)
	public Map<String,String> handleArithmeticException(ArithmeticException ae) {
		  Map<String,String> map=new HashMap<>();
		  map.put("Error", ae.getMessage());
		  return map;
	}
	
	
	@ExceptionHandler(AgeInvalidException.class)
	public Map<String,String> handleAgeInvalidException(AgeInvalidException a){
		
		 Map<String,String> map=new HashMap<>();
		 map.put("ERROR", a.getMessage());
		 map.put("key", "try to give age greater than 18");
		 return map;
	}

}
