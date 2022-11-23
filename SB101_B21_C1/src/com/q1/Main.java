package com.q1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		Functional Programming
		
		Functional Programming is a programming style where programs are constructed by composing and applying functions,
		i.e., by breaking the problem into 'functions'.
		In Functional Programming, functions are treated as first-class citizens, meaning that they can be bound to names,
		passed as arguments, and returned from other functions, just as any other data type.
		
		
		Functional Interface
		
		An interface having only one abstract method is known as functional interface. It may have any number of default,
		static methods, but can have only one abstract method.
		It is also known as Single Abstract Method Interfaces or SAM interfaces.
		It is used to achieve functional programming.		
		*/
		
		Predicate<Employee> pred = e -> e.getSalary() > 8000;
		
		System.out.println(pred.test(new Employee(5, "Ram", 5000)));
		System.out.println(pred.test(new Employee(10, "Rajesh", 15000)));
		
		
		
		Consumer<Employee> comp = e -> System.out.println(e);
		
		comp.accept(new Employee(12, "Ramesh", 18000));
		
		
		
		Supplier<Employee> supp = () -> new Employee(16, "Ashish", 20000);
		
		System.out.println(supp.get());
		
		
		
		Function<String, Employee> fun = s -> {
			String[] arr = s.split(",");
			return new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])/2);
		};
		
		System.out.println(fun.apply("10,Manoj,80000"));
	}

}
