package com.q2;

import java.util.concurrent.Callable;

public class MyThread implements Callable<String>{
	
	Student st;
	
	public MyThread() {}
	
	public MyThread(Student st) {
		super();
		this.st = st;
	}

	@Override
	public String call() throws Exception {
		
		String res = "Roll " + st.getRoll() + " student is "; 
		System.out.println("This is done by " + Thread.currentThread().getName());
		if(st.getMarks() < 500) res += "Fail";
		else res += "Pass";
		
		return res;
	}

}
