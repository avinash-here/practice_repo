package com.useCases;

import java.util.Scanner;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImpl;


public class DeleteDepartment {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter dept id");
		int deptId = scan.nextInt();		
				
		DepartmentDao ddao = new DepartmentDaoImpl();
		
		ddao.deleteDepartment(deptId);
		
	}

}
