package com.q4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1, "Amit", 40000, "amit@gmail.com", "amit@247", new Address("UP", "Varanasi", "862461")));
		emps.add(new Employee(2, "Nilesh", 45000, "nile@gmail.com", "neel@356", new Address("MP", "Indore", "212124")));
		emps.add(new Employee(3, "Saima", 50000, "saima@gmail.com", "saima@865", new Address("HP", "Solan", "326522")));
		emps.add(new Employee(4, "Tahir", 55000, "tahir@gmail.com", "that@321", new Address("AP", "Hyderabad", "452003")));
		emps.add(new Employee(5, "Rishav", 60000, "rishav@gmail.com", "res@135", new Address("MH", "Pune", "103553")));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
		
		oos.writeObject(emps);
		oos.close();
		
	}

}
