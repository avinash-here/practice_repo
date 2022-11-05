package useCases;

import java.util.List;

import dao.StudentDao;
import dao.StudentDaoImpl;
import exceptions.StudentException;
import models.StudentBean;

public class GetAllStudentDetails {
	
	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
		try {
			List<StudentBean> res = dao.getStudentDetails();
			
			for(StudentBean sb : res) System.out.println(sb);
			
		} catch (StudentException e) {			
			e.printStackTrace();
		}
		
		
	}
		
	

}
