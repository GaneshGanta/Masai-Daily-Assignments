package com.masai.Classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Responses {
	
	
	@RequestMapping("/a")
	public Employee employeeDetails() {
		
		
		Employee emp = new Employee(1, "Ganesh", "Backend");
		
		return emp;
		
		
	}
	
	
	@RequestMapping("/e")
	public List<Employee> employeeLists(){
		
		List<Employee> emps = new ArrayList<>();
		
		Employee emp1 = new Employee(1, "Ganesh", "Backend");
		Employee emp2 = new Employee(2, "Ganesh", "Backend");
		Employee emp3 = new Employee(3, "Ganesh", "Backend");
		Employee emp4 = new Employee(4, "Ganesh", "Backend");
		Employee emp5 = new Employee(5, "Ganesh", "Backend");
		
		
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		
		return emps;

		
		
	}
	
	
	@RequestMapping("/welcome")
	public String message() {
		
		return "Welcome to Spring Boot";
		
	}
	
	

}
