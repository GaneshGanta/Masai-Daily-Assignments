package com.usecase;

import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.entityClass.Employee;
import com.exception.EmployeeException;

public class RegisterEmployee {
	
	
	public static void registerEmployee() {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter employee name :");
		String name = in.next();
		
		System.out.println("enter employee Id :");
		int id = in.nextInt();
		
		System.out.println("Enter employee salary :");
		int salary = in.nextInt();
		
		Employee emp = new Employee(id,name,salary);
		
		try {
			String str = new EmployeeDaoImpl().registerEmployee(emp);
			
			System.out.println(str);
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
