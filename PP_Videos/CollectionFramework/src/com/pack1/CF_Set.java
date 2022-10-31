package com.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CF_Set {
	
	public static void main(String[] args) {
		
		// Set -> HashSet, LinkedHashSet, TreeSet.
		// add  size  contains  isEmpty  remove  
		
		Set<Integer> set = new TreeSet<>();
		
		
		set.add(56);
		set.add(16);
		set.add(62);
		set.add(28);
		
		System.out.println(set);
		
		
	}

}
