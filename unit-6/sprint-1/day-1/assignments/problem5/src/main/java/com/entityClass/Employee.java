package com.entityClass;

public class Employee {
	
	private int empId;
	private String empName;
	private int Salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	
	
	
	
	

}
