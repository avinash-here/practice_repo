package com.useCases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.models.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name = sc.next();
		
		System.out.println("Enter Employee Address");
		String address = sc.next();
		
		System.out.println("Enter Employee Email");
		String email = sc.next();
		
		System.out.println("Enter Employee Password");
		String password = sc.next();
		
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEname(name);
		emp.setAddress(address);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setSalary(salary);
		
		EmployeeDao empdao = new EmployeeDaoImpl();
		
		String result = empdao.registerEmployeeWithoutDeptId(emp);
			
		System.out.println(result);	
	}

}
