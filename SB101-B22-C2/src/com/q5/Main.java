package com.q5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		
		List<String> allLines = br.lines().collect(Collectors.toList());
		br.close();
		
		for(String line : allLines) System.out.println(line);
		
		
		PrintWriter pr = new PrintWriter("file2.txt");
		
		for(String line : allLines) pr.println(line);
		
		pr.flush();
		pr.close();
		
		System.out.println("Done");		
		
	}

}
