package com.pack1;

public class Demo {
	
	// Functional Interface : An interface that has only one abstract method.
	
	public static void main(String[] args) {
		
//		FunIntr inter = new FunIntrImpl();
//		
//		inter.fun();
		
//		FunIntr inter2 = new FunIntr() {
//			@Override
//			public void fun() {
//				System.out.println("Using inner implementation class");				
//			}
//
//			@Override
//			public void fun2() {
//				// TODO Auto-generated method stub
//				
//			}			
//		};
		
		//inter2.fun();
		
		
		FunIntr inter3 = n -> System.out.println("Using Lambda Expression " + n);
			
		
		
		inter3.fun("Vaibhav");
		
	}
	
	
	
	

}
