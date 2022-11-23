package com.q3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Raghav", "Abhinav", "Mohan", "Nilesh", "Sameer", "Yash", "Badal", "Cheeku", "Farhan", "Joy");
		
		List<String> filtered = list.stream().filter(s -> s.length()%2 == 0)
											 .map(s -> s.toUpperCase())
											 .collect(Collectors.toList());
		
				
		filtered.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) > 0) return -1;
				else if(o1.compareTo(o2) < 0) return 1;
				else return 0;
			}
		});
		
		list.forEach(s -> System.out.println(s));
		filtered.forEach(s -> System.out.println(s));
		
		//System.out.println("a".compareTo("c"));
		
	}

}
