package com.q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	/*
	
	Features of Stream API: 
	
	1. Stream does not store the elements, it only represents the elements in a sequence.
	
	2. It represents only the flow of objects, it doesn't allowed primitives.
	
	3. Any operations performed on the stream object does not modify its source object.
	
	4. With the help of stream object we can perform various useful operations on the 
	collection of data in functional style, like filtering some elements, printing some
	elements, transforming some elements, etc.
	
	
	Intermediate methods : Methods that return another stream as a result.
		1. filter()
		2. map()
		
	Terminal methods : Methods that mark the end of the stream and return the result.
		1. forEach()
		2. max()
		3. min()
		4. anyMatch()
		5. count()
	 
	*/

	public static void main(String[] args) {
		
		
		// Intermediate methods example
		List<String> names = Arrays.asList("Rahul", "Ankit", "Suraj", "Vyas", "Ram", "Sham");
		
		List<String> filterNames = names.stream().filter(name -> name.length()>4)
												 .collect(Collectors.toList());
		
		System.out.println(filterNames);
		
		
		// Terminal methods
		names.stream().forEach(name -> System.out.println(name));
		

	}

}
