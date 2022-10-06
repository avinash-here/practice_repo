package pack1;

import java.util.Arrays;
import java.util.List;

public class A {  // Java day12 / Maps / Collections / Iterator 
    
    // "Arrays" is a class in java.util package that provides some static methods to operate on arrays in java.
    // Some of the methods are Arrays.toString(), Arrays.sort(), etc.
	
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		
		Integer[] arr = {4, 3, 8, 1, 6, 2, 7, 5};
		System.out.println(Arrays.toString(arr)); // Expected Output: [4, 3, 8, 1, 6, 2, 7, 5] / Arrays.toString(); / returns a String
		Arrays.sort(arr);                                                                    // Arrays.sort();   
		System.out.println(Arrays.toString(arr)); // Expected Output: [1, 2, 3, 4, 5, 6, 7, 8] 
		
		List<Integer> list = Arrays.asList(arr);                                          // Arrays.asList(); / returns a List<>
		System.out.println(list);                 // Expected Output: [1, 2, 3, 4, 5, 6, 7, 8]
		
		int j = Arrays.binarySearch(arr, 0);      // Arrays.binarySearch(); / returns an Integer / to apply this, array must be sorted.
		System.out.println(j);                    // Expected Output: -1
		j = Arrays.binarySearch(arr, 5);
		System.out.println(j);                    // Expected Output: 4  (index of the element)
		
	}

}