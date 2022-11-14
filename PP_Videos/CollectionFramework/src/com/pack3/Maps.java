package com.pack3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	
	// Map -> Interface
	
	// a DS that contains key-value pairs
	
	// where key can't be duplicate
	// it contains unique keys only
	
	// A pair of key and value is called an entry
	
	
	// Map hierarchy
	
	//  Map(I) -> implemented by ->  HashMap(C)   -> extended by LinkedHashMap(C) 
	//         -> extended by    ->  SortedMap(I) -> implemented by TreeMap(C)
	
	public static void main(String[] args) {
		
		Map<Student, String> map = new TreeMap<>();
		
		
		map.put(new Student(21, 500, "Ashish"), "Ten");
		map.put(new Student(22, 560, "DevAshish"), "Five");		
		map.put(new Student(55, 420, "Anish"), "Two Hundred");
		map.put(new Student(35, 620, "Rajesh"), "Hundred");
		map.put(new Student(20, 640, "Umesh"), "Sixty");
		
		
		
		System.out.println(map);
		
		
			
		
	}
	

}
