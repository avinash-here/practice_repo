package com.ques1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	/*
	Functional Programming
	
	Functional Programming is a programming style where programs are constructed by composing and
	applying functions, i.e., by breaking the problem into 'functions'.
	
	In Functional Programming, functions are treated as first-class citizens, meaning that they can be
	bound to names, passed as arguments, and returned from other functions, just as any other data type.
	
	
	Functional Interface
	
	An interface having only one abstract method is known as functional interface. It may have any number
	of default, static methods, but can have only one abstract method.
	
	It is also known as Single Abstract Method Interfaces or SAM interfaces.
	It is used to achieve functional programming.
			
	*/
	
	public static void main(String[] args) {
		
		Predicate<Product> pred = p -> p.getQuantity() < 5;
		
		System.out.println(pred.test(new Product(7, "Pen", 10, 8)));
		System.out.println(pred.test(new Product(10, "Pencil", 7, 4)));
		
		
		
		Consumer<Product> comp = p -> System.out.println(p);
		
		comp.accept(new Product(98, "Eraser", 5, 20));
		
		
		
		Supplier<Product> supp = () -> new Product(52, "Notebook", 50, 24);
		
		System.out.println(supp.get());
		
		
		
		Function<String, Product> fun = s -> {
			String[] arr = s.split(",");
			return new Product(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
		};
		
		System.out.println(fun.apply("16,GeometryBox,60,20"));
		
		
	}

}
