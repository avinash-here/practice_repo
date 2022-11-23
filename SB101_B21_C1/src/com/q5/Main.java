package com.q5;

public class Main {

	/*
	
	Method reference: - Java 8 introduced a new feature "Method Reference" which is used to refer 
	the methods of functional interfaces.
	It is a shorthand notation of a lambda expression to call a method.
	We can replace lambda expression with method reference (:: operator)
	on left side we put class/object name and on the other hand we put new/method name
	
	- Method reference of a non-static method  ==>  object::methodName

    - Method reference of a static method      ==>  ClassName::methodName

	- Method reference of a constructor        ==>  ClassName::new
	
		as constructor doesn't have return type so we can only allow the methods to refer constructor that has return type 'void'.
	
	*/
	
	public Main() { // constructor
		System.out.println("Hello everyone from non Main constructor...");
	}
	
	void sayHello1() { // non static method
		System.out.println("Hello everyone from non static sayHello1...");
	}
	
	static void sayHello2() { // static method
		System.out.println("Hello everyone from static sayHello...");
	}

	public static void main(String[] args) {
		
		// Method reference using constructor
		Intr i1 = Main::new ;
		i1.sayHello();
		
		// Method reference using static method
		Intr i2 = Main::sayHello2;
		i2.sayHello();
		
		// Method reference using non static method
		Intr i3 = new Main()::sayHello1;
		i3.sayHello();
	}
}

@FunctionalInterface
interface Intr {
	
	void sayHello();
	
}
