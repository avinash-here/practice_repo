package com.dao;

import com.models.Employee;

public interface EmployeeDao {
	
	public String registerEmployeeWithoutDeptId(Employee emp);	
	
	public String assignDeptToEmp(int deptId, int empId);
	
	public String loginEmployee(String emailId, String password);
	
	public void employeePassword(String email, String password);
	

}
