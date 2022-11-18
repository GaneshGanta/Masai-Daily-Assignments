package com.implementation;

import java.util.Scanner;

import com.usecase.GetEmployeeById;
import com.usecase.RegisterEmployee;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" 1.register an employee\r\n "
				+ "2.get employee by id.");
		
		int choice = in.nextInt();
		
		if(choice == 1) {
			
			RegisterEmployee.registerEmployee();
			
		}
		else if(choice == 2) {
			
			GetEmployeeById.getEmployeeById();
			
		}else {
			
			System.out.println("choose valid option....11");
		}
		
		
		
		
	}
	

}
