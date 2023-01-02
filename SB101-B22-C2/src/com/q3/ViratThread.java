package com.q3;

public class ViratThread extends Thread{
	
	@Override
	public void run() {
		
		int sum = 0;
		for(int i = 1; i <= 20; i++) sum += i;
		
		System.out.println(Thread.currentThread().getName() + "'s calculated sum: " + sum);
		
	}

}
