package com.q3;

public class RohitThread extends Thread{
	
	@Override
	public void run() {
		
		int product = 1;
		for(int i = 1; i <= 10; i++) product *= i;
		
		System.out.println(Thread.currentThread().getName() + "'s calculated product: " + product);
		
	}

}
