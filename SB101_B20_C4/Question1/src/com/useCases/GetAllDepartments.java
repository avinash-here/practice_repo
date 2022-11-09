package com.useCases;

import java.util.List;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImpl;
import com.models.Department;

public class GetAllDepartments {
	
	public static void main(String[] args) {
		
		DepartmentDao ddao = new DepartmentDaoImpl();
		
		List<Department> departments = ddao.getAllDepartment();
		
		departments.forEach(dept -> System.out.println(dept));
	}

}
