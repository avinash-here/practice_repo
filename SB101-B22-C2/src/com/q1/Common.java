package com.q1;

public class Common {
	
	int value;
	boolean flag = true;
	
	public synchronized void produce(int i) {			
		if(flag) {
			value = i;
			System.out.println("Producer produced: " + value);
			
			flag = false;
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}				
	}
	
	public synchronized int consume() {		
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		flag = true;
		this.notify();
		
		int sum = 0;
		for(int i = 0; i <= value; i++) sum += i;
		return sum;
	}
}
