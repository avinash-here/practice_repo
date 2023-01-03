package com.q3;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		DhoniThread dt = new DhoniThread();
		RohitThread rt = new RohitThread(dt);
		ViratThread vt = new ViratThread(rt);
		
		dt.setName("Dhoni");  rt.setName("Rohit");  vt.setName("Virat");
		
		dt.setPriority(10);
		
		dt.start();			
		rt.start();		
		vt.start();		
		
	}

}

