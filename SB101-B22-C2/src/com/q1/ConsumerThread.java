package com.q1;

public class ConsumerThread extends Thread{
	
	Common c;
	
	public ConsumerThread(Common c) {		
		this.c = c;
	}

	@Override
	public void run() {

		while(true) {
			int j = c.consume();
			System.out.println("Consumer consumed: " + j + "\n");	
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
