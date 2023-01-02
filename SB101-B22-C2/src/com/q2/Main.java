package com.q2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String[] args) {
		
		MyThread[] threads = {
				new MyThread(new Student(16, "Sanket", "Mumbai", 720)),
				new MyThread(new Student(17, "Binod", "Boriwali", 420)),
				new MyThread(new Student(19, "Vikas", "Andheri", 460)),
				new MyThread(new Student(22, "Sonali", "Pune", 640)),
				new MyThread(new Student(24, "Harsh", "Khandala", 580)),
				new MyThread(new Student(25, "Rubi", "Lonawala", 485))
		};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for(MyThread th : threads) {
			Future<String> f = es.submit(th);
			
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {				
				e.printStackTrace();
			}
		}
		
		
	}

}
