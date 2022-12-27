package com.ques2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();		
		
		list.add(new Student(2, "Binod", 215, "Delhi"));
		list.add(new Student(4, "John", 426, "Patna"));
		list.add(new Student(8, "Kailash", 564, "Mumbai"));
		list.add(new Student(10, "Manoj", 464, "Chennai"));
		list.add(new Student(1, "Ankit", 656, "Rajasthan"));
		
		List<Employee> emps = list.stream().filter(s -> s.getMarks() > 500)
					 			  		   .map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks()*1000, s.getAddress()))
					 			  		   .collect(Collectors.toList());
		
		emps.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				if(emp1.getSalary() < emp2.getSalary()) return 1;
				else if(emp1.getSalary() > emp2.getSalary()) return -1;
				else return 0;
			}			
		});
		
		System.out.println("Employees List");
		emps.forEach(e -> System.out.println(e));
		System.out.println();
		System.out.println("Original Students List");
		list.forEach(s -> System.out.println(s));
	}

}
