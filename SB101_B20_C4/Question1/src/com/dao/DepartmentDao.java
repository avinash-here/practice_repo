package com.dao;

import java.util.List;

import com.models.Department;

public interface DepartmentDao {
	
	public String addDepartment(Department dept);
	
	public List<Department> getAllDepartment();
	
	public String updateDeptLocation(int deptId, String location);
	
	public void deleteDepartment(int did);
	
}
