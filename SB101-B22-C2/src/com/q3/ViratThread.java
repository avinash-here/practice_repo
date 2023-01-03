package com.q3;

public class ViratThread extends Thread{
	
	RohitThread r;
	
	public ViratThread(RohitThread r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		
		try {
			r.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int sum = 0;
		for(int i = 1; i <= 20; i++) sum += i;
		
		System.out.println(Thread.currentThread().getName() + "'s calculated sum: " + sum);
		
	}

}
