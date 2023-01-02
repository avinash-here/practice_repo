package com.q3;

public class DhoniThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " is printing " + i);
		}
		
	}

}
