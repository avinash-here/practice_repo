package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.models.Employee;
import com.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String registerEmployeeWithoutDeptId(Employee emp) {		
		String res = "Employee Registration Failed";
		
		try (Connection con = DBUtil.provideConnection()){
			
			PreparedStatement ps = con.prepareStatement("insert into employee(empId, ename, address, email, password, salary) "
					                                  + "values(?, ?, ?, ?, ?, ?)");
			
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getAddress());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());
			ps.setInt(6, emp.getSalary());
			
			int i = ps.executeUpdate();
			
			if(i > 0) res = "Employee Registration Successful";
						
		} catch (SQLException e) {
			res = e.getMessage();
		}
		
		return res;
	}

	@Override
	public String assignDeptToEmp(int deptId, int empId) {
		
		String isAssign = "Employee not assigen to any dept...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update employee set deptId=? where empId=?");
			
			ps.setInt(1, deptId);
			ps.setInt(2, empId);
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				
				isAssign = "Employee assigned to department successfully!";
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return isAssign;
	}

	@Override
	public String loginEmployee(String emailId, String password) {
		
		String login = "Invalid Credentials";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where email=? and password=?");
			
			ps.setString(1, emailId);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				login = "Welcome " + rs.getString("ename");				
				
			}			
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());			
		}
		
		return login;
		
	}

	@Override
	public void employeePassword(String email, String password) {
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update employee set password=? where email=?");
			
			ps.setString(1, password);
			ps.setString(2, email);
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				
				System.out.println("Password updated successfully!");
				
			}
			else {
				System.out.println("Employee not found with this details...");
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
