package dao;

import java.util.List;

import exceptions.StudentException;
import models.StudentBean;

public interface StudentDao {
	
	public List<StudentBean> getStudentDetails() throws StudentException;

}
