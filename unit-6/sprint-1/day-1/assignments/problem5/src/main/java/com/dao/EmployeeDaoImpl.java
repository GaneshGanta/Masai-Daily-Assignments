package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.JDBCConnection;
import com.entityClass.Employee;
import com.exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {


	public String registerEmployee(Employee employee) throws EmployeeException {
		
		
		
		String message = "Employee could not be created";
		
		try(Connection conn = JDBCConnection.establishConnection()){
		
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?)");
			
			
			ps.setInt(1, employee.getEmpId());
			
			ps.setString(2, employee.getEmpName());
			
			ps.setInt(3, employee.getSalary()); 
			
			int x = ps.executeUpdate(); 
			
			if(x>0) {
				
				message = "Employee created successfully!";
			
			}
			else throw new EmployeeException(message);
			
		}catch(SQLException sqe) {
			
			throw new EmployeeException(sqe.getMessage());
		}
		
		return message;
		
		
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee emp = null;
		
		try(Connection conn = JDBCConnection.establishConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where empId =?");
			
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int id = rs.getInt("empId");
				String name = rs.getString("empName");
				int salary = rs.getInt("salary");
				
//				System.out.println(id);
//				System.out.println(name);
//				System.out.println(salary);
				
				emp = new Employee(id, name, salary);
				
			}
			
			
			return emp;
			
		}catch (SQLException e) {
			
			throw new EmployeeException(e.getMessage());
			
		}
		
		
		
		
	}
	
	
	
	

}
