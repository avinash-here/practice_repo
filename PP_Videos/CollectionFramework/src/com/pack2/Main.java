package com.pack2;

public class Main {
	
	public static void main(String[] args) {		
		// Functional Interface - An interface that has only one abstract method.
		// -> may have any number of default, static methods but can have only one abstract method.
		
		// Some of the predefined functional interfaces in Java are:
		// Comparable,  Comparator,  Runnable,  etc.
		
		//  @FunctionalInterface  annotation
		//  it helps the compiler to check whether the annotated interface is a valid functional interface or not.
		
		// How to implement an interface:
		// 1. Using External Class
		// 2. Anonymous Inner Class
		
		// 3. Lambda Expression 
		//    -> it is basically an anonymous method, used to implement a method defined in a functional interface.
		//       and by using LE, we can represent an object of a functional interface in much more concise way.
		
		//    syntax format :  (args) -> {body}
		//    a. with zero parameters
		// 	  b. with one parameter
		//    c. with more than one parameters		
		
		
//		Intr i1 = new A();
//		
//		//i1.fun1();
//		
//		
//		Intr i2 = new Intr() {
//
//			@Override
//			public void fun1() {
//				System.out.println("From Anonymous Inner Class");				
//			}
//			
//		};
//		
//		i2.fun1();
		
		
		String name = "Raghavendra";
		Intr i3 = () ->  150;
	
		
		int i = i3.fun1();
		System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
