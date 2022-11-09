package com.useCases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EmployeeLogin {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Email");
		String email = sc.next();
		
		System.out.println("Enter Employee Password");
		String pass = sc.next();
		
		EmployeeDao empdao = new EmployeeDaoImpl();
		
		String result = empdao.loginEmployee(email, pass);
				
		System.out.println(result);
				
	}

}
