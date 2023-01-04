package com.q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employeedata.txt"));
		
		List<Employee> list = (List) ois.readObject();
		ois.close();
		
		list.forEach(emp -> System.out.println(emp));
		
		list.add(new Employee(6, "Binod", 62000, "binod@gmail.com", "dekh-raha-hai-binod", new Address("UP", "Fulera", "832646")));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
		
		oos.writeObject(list);
		oos.close();
	}

}
