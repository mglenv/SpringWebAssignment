package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeAssingment {

	@Autowired
	private EmployeeRepository empRepo;
	
		//GET all Employees
		@RequestMapping("/employees")
		public List<Employee> getAllEmployees() {
			return empRepo.getEmpList();
		}
		
		//GET individual Employee
		@RequestMapping("/employees/{id}")
		public Employee getEmployee(@PathVariable String id) {
			return empRepo.getEmployee(id);
		}
		
		//POST Employee
		//RequestMapping default is a GET request
		@RequestMapping(method=RequestMethod.POST, value="/employees")
		public void addEmployee(@RequestBody Employee employee) {
			empRepo.addEmployee(employee);		
		}
		
		//PUT Employee
		@PutMapping(value="/employees/{id}")
		public void updateEmployee(@RequestBody Employee employee) {
			empRepo.updateEmployee(employee);		
		}
		
		//DELETE Employee
		@DeleteMapping(value="/employees/{id}")
		public void deleteEmployee(@PathVariable String id) {
			empRepo.deleteEmployee(id);		
		}
}
