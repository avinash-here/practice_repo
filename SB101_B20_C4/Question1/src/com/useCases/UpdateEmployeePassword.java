package com.useCases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class UpdateEmployeePassword {
	
	public static void main(String[] args) {
		
		EmployeeDao edao = new EmployeeDaoImpl();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Employee Id");
		String empID = scan.next();
		System.out.println("Enter New Password");
		String password = scan.next();
				
		edao.employeePassword(empID, password);
	}
	
}
