package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.StudentException;
import models.StudentBean;
import utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public List<StudentBean> getStudentDetails() throws StudentException {
		
		List<StudentBean> result = new ArrayList<>();	
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				int roll = rs.getInt("roll");
				String name= rs.getString("name");
				int marks = rs.getInt("marks");
				
				StudentBean sb = new StudentBean(roll, name, marks);
				
				result.add(sb);				
			}
			
		} catch (SQLException e) {
			 e.printStackTrace();
		}		
		
		return result;
	}

}
