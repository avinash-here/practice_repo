package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.models.Department;
import com.utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String addDepartment(Department dept) {
		
		String str = "Department not added!";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into department values (?, ?, ?)");
			
			ps.setInt(1, dept.getDid());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLocation());			
			
			int i = ps.executeUpdate();
		
			if(i > 0) str = "Department added successfully";
			
		} catch (SQLException e) {
			str = e.getMessage();
		}
		return str;
	}

	@Override
	public List<Department> getAllDepartment() {

		List<Department> departments = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Department dept = new Department(rs.getInt("did"), rs.getString("dname"), rs.getString("location"));
				
				departments.add(dept);
				
			}			
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());			
		}
		
		return departments;
	}

	@Override
	public String updateDeptLocation(int dept, String location) {
			
		String isUpdated = "Location is not updated...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update department set location=? where did=?");
			
			ps.setString(1, location);
			ps.setInt(2, dept);
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				isUpdated = "Location is updated successfully!";
			}
			
		} catch (SQLException e) {			
			System.out.println(e.getMessage());			
		}
		
		return isUpdated;
		
	}

	@Override
	public void deleteDepartment(int deptId) {

		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete from department where did=?");
			
			ps.setInt(1, deptId);
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				System.out.println("Department deleted successfully!");
			}
			else
				System.out.println("Department not deleted...");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
