package com.pack1;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CF_Queue_Stack {
	
	public static void main(String[] args) {
		
		// Stack  frequently used methods -> add, contains, get, isEmpty, remove, set, size, iterator
		
//		Stack<Integer> stk = new Stack<>();   //  push  pop  peek
//		
//		stk.add(5);
//		stk.add(8);
//		stk.push(15);
//		stk.add(28);
//		
//		//System.out.println(stk.set(1, 10));
//		
//		((Stack<Integer>) stk).pop();
//		
//		System.out.println(stk.peek());
//		System.out.println(stk);
		
		
		Queue<Integer> q = new ArrayDeque<>();  // Priority Queue
		
		q.add(5);
		q.add(15);
		q.add(56);
		q.add(35);
		q.offer(55);
		
		System.out.println(q.peek());
		
		System.out.println(q);   //  poll  offer 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
