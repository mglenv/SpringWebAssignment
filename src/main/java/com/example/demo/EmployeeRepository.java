package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	private ArrayList<Employee> empList = new ArrayList<Employee>(
			Arrays.asList(
					new Employee("012", "Matt Verhey", "Back of house", "Dishwasher", "30000"),
					new Employee("024", "Josh Smith", "Back of house", "Chef", "45000"),
					new Employee("011", "Michael Thompson", "Front of house", "Hostess", "35000"),
					new Employee("043", "Sasha Vucevic", "Front of house", "Bartender", "37500"),
					new Employee("064", "Steve Novak", "Front of house", "Bartender", "40000")
					)
			);

	public ArrayList<Employee> getEmpList(){
		return empList;
	}
	
	public Employee getEmployee(String id) {
		for (Employee e: empList) {
			if(e.getEmployeeId().equals(id)) {
				return e;
			}
		}return null;
	}
	
	public Employee addEmployee(Employee newEmp) {
		for(Employee e : empList) {
			if(newEmp.getEmployeeId().equals(e.getEmployeeId()))
				return null;
		}
		empList.add(newEmp);
		return newEmp;
	}
	
	public Employee deleteEmployee(String id) {
		for(Employee e : empList) {
			if(e.getEmployeeId().equals(id)) {
				empList.remove(e);
				return e;
			}
		}return null;
	}
	
	public Employee updateEmployee(Employee updatedEmp) {
		for(Employee oldEmp : empList) {
			if (oldEmp.getEmployeeId().equals(updatedEmp.getEmployeeId())) {
				oldEmp.setEmployeeName(updatedEmp.getEmployeeName());
				oldEmp.setEmployeeDept(updatedEmp.getEmployeeDept());
				oldEmp.setEmployeeDesig(updatedEmp.getEmployeeDesig());
				oldEmp.setEmployeeSalary(updatedEmp.getEmployeeSalary());
				
				return oldEmp;
			}
		}return null;
	}
	
	
}
