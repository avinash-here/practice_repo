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
		
		// Logical AND operator
		System.out.println(true & true);  // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false);// false
		
		// Logical OR operator
		System.out.println(true | true);  // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false);// false
		
		// XOR operator
		System.out.println(true ^ true);  // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false);// false
		
		// Bitwise Logical Operator
		int n = 8;  int p = 6;   //  8 : 1000   6 : 0110
		System.out.println(n&p);  // 0   Bitwise AND operator
		System.out.println(n|p);  // 14  Bitwise OR operator
		System.out.println(n^p);  // 14  Bitwise XOR operator
		
		// Bitwise Right Shift Operator  '>>'  This operator decreases the value.
		// Bitwise Left Shift Operator   '<<'  This operator increases the value.
		
		System.out.println(10 >> 1);   // 01010 -> 00101
		System.out.println(10 << 1);   // 01010 -> 10100
		
		// Short-Circuit Operators : && and ||
		// The difference between boolean logical operators and short-circuit operators is,
		// boolean logical operator checks all the expressions before reaching at a result.
		// while short circuit decides the result at false in && and at true in ||.
		
		// Example:
		int g = 10;  int h = 10;
		
		if((g++ == 10) | (h++ == 10)) {
			System.out.println(g + "  " + h);  // 11  11 
		}
		
		g = 10;  h = 10;
		if((g++ == 10) || (h++ == 10)) {
			System.out.println(g + "  " + h);  // 11  10
		}
		
		g = 10;  h = 10;
		
		if((g++ != 10) & (h++ != 10)) { }
			System.out.println(g + "  " + h);  // 11  11 
		
		
		g = 10;  h = 10;
		if((g++ != 10) && (h++ != 10)) { }
			System.out.println(g + "  " + h);  // 11  10
		
		// What is TypeCasting?
		// The conversion of one data type to any other compatible data type is known as Type Casting.
			
		// There are two kinds of Type Casting:
		//   Implicit Type Casting : conversion of smaller data type to higher data type.
		//   Explicit Type Casting : conversion of higher data type to smaller data type.
			
		// Example of Implicit Type Casting:
			short s = 100;
			int i = s;
			
		// Example of Explicit Type Casting:
			int j = 100;
			short t = (short)j; 
		
			
		byte b = 5;
		byte c = 4;
		byte d = (byte)(b*c);   
		//  When we do any arithmetic operation on any primitive data type, then the 
		//  resultant data type will be decided on the following formula:
		//  MAX(int, type1, type2, . . . . )
		
		System.out.println(d);
			
		
	}

}
