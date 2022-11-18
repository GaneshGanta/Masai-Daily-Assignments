package com.usecase;

import java.util.Scanner;

import com.dao.EmployeeDaoImpl;
import com.entityClass.Employee;
import com.exception.EmployeeException;

public class GetEmployeeById {

	
public static void getEmployeeById() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee Id :");
		
		int id = in.nextInt();
		
		try {
			
			Employee emp = new EmployeeDaoImpl().getEmployeeById(id);
			System.out.println(emp);
			
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}
	
}
