package com.useCases;

import java.util.Scanner;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImpl;
import com.models.Department;

public class AddNewDepartment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department Id");
		int did = sc.nextInt();
		
		System.out.println("Enter Department Name");
		String name = sc.next();
		
		System.out.println("Enter Department Location");
		String location = sc.next();
		
		Department dept = new Department(did, name, location);		
		
		DepartmentDao ddao = new DepartmentDaoImpl();
		
		String result = ddao.addDepartment(dept);
		
		System.out.println(result);		
	}

}
