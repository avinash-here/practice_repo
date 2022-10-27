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
		
		// Example 2
		System.out.println(++a - ++a);  //-1
		System.out.println(++a - a++);  // 0

		// Example 3
		System.out.println((--a + --a)*(++a - a--) + (--a + a--)*(++a + a++));  // 484
		
		// XOR operator: '^' is the symbol for xor operator. It returns true if both the operands are different,
		//               otherwise it returns false.
		
		// AND operator
		System.out.println(true & true);  // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false);// false
		
		// OR operator
		System.out.println(true | true);  // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false);// false
		
		// AND operator
		System.out.println(true ^ true);  // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false);// false
		
	}

}
