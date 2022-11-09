package com.useCases;

import java.util.Scanner;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImpl;

public class UpdateLocation {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Department Id");
		int did = scan.nextInt();
		System.out.println("Enter New Department Location");
		String location = scan.next();
		
		DepartmentDao ddao = new DepartmentDaoImpl();
		
		String message = ddao.updateDeptLocation(did, location);
		
		System.out.println(message);		
	}

}
