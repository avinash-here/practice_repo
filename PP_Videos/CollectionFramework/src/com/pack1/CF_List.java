package com.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CF_List {
	
	public static void main(String[] args) {
		
		/*
		 List<Integer> list = new ArrayList<>();
		 
				
		list.add(4);
		list.add(10);
		list.add(null);
		list.add(null);
		list.add(20);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		
		List<String> link = new LinkedList<>();
		
		link.add("aman");
		link.add("avinash");
		link.add("shubham");
		link.add("swati");
		
		// 1 2 3 5 6
		
		for(String s : link) {
			System.out.println(s);
		}
		
	}

}
