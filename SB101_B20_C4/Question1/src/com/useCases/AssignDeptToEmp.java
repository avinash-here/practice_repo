package com.useCases;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class AssignDeptToEmp {
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter emp id");
		int empId = scan.nextInt();
		System.out.println("Enter dept id");
		int deptId = scan.nextInt();
		
				
		EmployeeDao es = new EmployeeDaoImpl();
		
		String message = es.assignDeptToEmp(deptId, empId);
		
		System.out.println(message);
		
	}

}
