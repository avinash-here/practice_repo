package com.q3;

public class RohitThread extends Thread{
	
	DhoniThread d;
	
	public RohitThread(DhoniThread d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int product = 1;
		for(int i = 1; i <= 10; i++) product *= i;
		
		System.out.println(Thread.currentThread().getName() + "'s calculated product: " + product);
		
	}

}
