package com.q3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		DhoniThread dt = new DhoniThread();
		RohitThread rt = new RohitThread();
		ViratThread vt = new ViratThread();
		
		dt.setName("Dhoni");  rt.setName("Rohit");  vt.setName("Virat");
		
		dt.setPriority(10);
		dt.start();
		dt.join();
		
		rt.start();
		rt.join();
		
		vt.start();
		
		
	}

}

