package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAssingment {
	
	//addition of two numbers
	@RequestMapping(value="/calculate/add/{x}/{y}", method=RequestMethod.GET)
	public double add(@PathVariable("x") double x, @PathVariable("y") double y) {
		return x + y;
	}
	
	//subtraction of two numbers
	@RequestMapping(value="/calculate/subtract/{x}/{y}", method=RequestMethod.GET)
	public double sub(@PathVariable("x") double x, @PathVariable("y") double y) {
		return x - y;
	}
	
	//multiplication of two numbers
	@RequestMapping(value="/calculate/multiply/{x}/{y}", method=RequestMethod.GET)
	public double mult(@PathVariable("x") double x, @PathVariable("y") double y) {
		return x * y;
	}
	
	//division of two numbers
	@RequestMapping(value="/calculate/divide/{x}/{y}", method=RequestMethod.GET)
	public double div(@PathVariable("x") double x, @PathVariable("y") double y) {
		return x / y;
	}
	
	//square root of a number
	@RequestMapping(value="/calculate/sqrt/{x}", method=RequestMethod.GET)
	public double sqrt(@PathVariable("x") double x) {
		return Math.sqrt(x);
	}

}
