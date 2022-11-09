package com.useCases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class LoginEmployee {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Employee Email");
		String email = scan.next();
		System.out.println("Enter Password");
		String password = scan.next();		
		
		EmployeeDao es = new EmployeeDaoImpl();		
		String result = es.loginEmployee(email, password);
		
		System.out.println(result);
	}

}
