package com.dao;

import com.entityClass.Employee;
import com.exception.EmployeeException;

public interface EmployeeDao {
	
	
	public String registerEmployee(Employee employee)throws EmployeeException;
	
	public Employee getEmployeeById(int empId)throws EmployeeException;

}
