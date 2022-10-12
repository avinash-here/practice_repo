package com.p1;

import java.util.function.Consumer;  
import java.util.function.Function;
import java.util.function.Predicate;  
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		
		Predicate<Student> pred = s -> s.getMarks() < 500;		
		System.out.println(pred.test(new Student(10, "Rahul", 640)));

		
		Consumer<Student> cons = s -> {
			System.out.println("Roll is: " + s.getRoll());
			System.out.println("Name is: " + s.getName());
			System.out.println("Marks is: " + s.getMarks());			
		};		
		cons.accept(new Student(10, "Rahul", 640));
		
		
		Supplier<Student> sup = () -> new Student(10, "Rahul", 640);		
		System.out.println(sup.get());
		
		
		Function<String, Integer> fun = s -> Integer.parseInt(s);		
		System.out.println(fun.apply("111")+5);		
	}
}