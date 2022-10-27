package com.pack1;

public class Main {
	
	public static void main(String[] args) {
		
		// Example 1
		int a = 10;
		System.out.println(a);    // 10
		System.out.println(a++);  // 10
		System.out.println(++a);  // 12 
		System.out.println(a--);  // 12
		System.out.println(--a);  // 10
		System.out.println(a);    // 10
		
		System.out.println(++a - ++a);  //-1
		System.out.println(++a - a++);  // 0
		
	}

}
