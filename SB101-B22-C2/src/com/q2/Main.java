package com.q2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyThread[] threads = {
				new MyThread(new Student(16, "Sanket", "Mumbai", 720)),
				new MyThread(new Student(17, "Binod", "Boriwali", 420)),
				new MyThread(new Student(19, "Vikas", "Andheri", 460)),
				new MyThread(new Student(22, "Sonali", "Pune", 640)),
				new MyThread(new Student(24, "Harsh", "Khandala", 580)),
				new MyThread(new Student(25, "Rubi", "Lonawala", 485))
		};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
//		Thread t = new Thread()

		/*
		 * Future<String> f1 = es.submit(threads[0]); Future<String> f2 =
		 * es.submit(threads[1]); Future<String> f3 = es.submit(threads[2]);
		 * Future<String> f4 = es.submit(threads[3]); Future<String> f5 =
		 * es.submit(threads[4]); Future<String> f6 = es.submit(threads[5]);
		 * 
		 * 
		 * System.out.println(f1.get()); System.out.println(f2.get());
		 * System.out.println(f3.get()); System.out.println(f4.get());
		 * System.out.println(f5.get()); System.out.println(f6.get());
		 * 
		 * 
		 * System.out.println();
		 */
		
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
