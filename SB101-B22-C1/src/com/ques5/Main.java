package com.ques5;

public class Main {
	
	/*	
	Method reference: - Java 8 introduced a new feature "Method Reference" which is used to refer 
	the methods of functional interfaces.
	It is a shorthand notation of a lambda expression to call a method.
	We can replace lambda expression with method reference (:: operator)
	on left side we put class/object name and on the other hand we put new/method name
	
	- Method reference for a non-static method  ==>  object::methodName

    - Method reference for a static method      ==>  ClassName::methodName

	- Method reference for a constructor        ==>  ClassName::new
	
		as constructor doesn't have return type so we can only allow the methods to refer constructor that
		has return type 'void'.	
	*/
	
	public Main() {}
	
	public Main(Student st) { // constructor
		System.out.println("Student details from constructor:");
		System.out.println(st);
		System.out.println();
	}
	
	void printDetails(Student st) { // non static method
		System.out.println("Student details from a non-static method:");
		System.out.println(st);
		System.out.println();
	}
	
	static void printDetails2(Student st) { // static method
		System.out.println("Student details from a static method:");
		System.out.println(st);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Student st = new Student(10, "Akshat", "Indore", "20-04-1996");
		
		// Method reference using constructor
		StudentService ss1 = Main::new ;
		ss1.printStudentDetails(st);
		
		// Method reference using static method
		StudentService ss2 = Main::printDetails2;
		ss2.printStudentDetails(st);
		
		// Method reference using non static method
		StudentService ss3 = new Main()::printDetails;
		ss3.printStudentDetails(st);
	}

}


