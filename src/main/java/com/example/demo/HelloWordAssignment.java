package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordAssignment {

	@GetMapping(value="/hello")
	public String hello() {
		return "<h1>Hello World</h1>";
	}
	
}
