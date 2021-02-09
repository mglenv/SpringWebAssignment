package com.example.demo;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String employeeDept;
	private String employeeDesig;
	private String employeeSalary;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public String getEmployeeDesig() {
		return employeeDesig;
	}
	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Employee(String employeeId, String employeeName, String employeeDept, String employeeDesig,
			String employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeDesig = employeeDesig;
		this.employeeSalary = employeeSalary;
	}
	
	
	
}
