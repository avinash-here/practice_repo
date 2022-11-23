package com.q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Rahul", 656, "Rajasthan"));
		list.add(new Student(2, "Mehul", 215, "Delhi"));
		list.add(new Student(4, "Amaresh", 426, "Patna"));
		list.add(new Student(8, "John", 564, "Mumbai"));
		list.add(new Student(10, "Gaurav", 464, "Chennai"));
		
		List<Employee> emps = list.stream().filter(s -> s.getMarks() > 500)
					 			  		   .map(s -> new Employee(s.getRoll(), s.getName(), s.getMarks()*1000, s.getAddress()))
					 			  		   .collect(Collectors.toList());
		
		emps.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary() < o2.getSalary()) return 1;
				else if(o1.getSalary() > o2.getSalary()) return -1;
				return 0;
			}			
		});
		
		emps.forEach(e -> System.out.println(e));
		System.out.println();
		list.forEach(s -> System.out.println(s));
	}
}
