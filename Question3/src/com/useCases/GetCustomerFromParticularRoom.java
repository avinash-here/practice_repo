package com.useCases;

import java.util.List;
import java.util.Scanner;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exceptions.RoomException;
import com.models.Customer;

public class GetCustomerFromParticularRoom {
	
	public static void main(String[] args) {
		
		CustomerDao cd = new CustomerDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Room Number :");
		int roomNo = sc.nextInt();
		
		try {
			List<Customer> customers = cd.getCustomerFromParticularRoom(roomNo);
			
			for(Customer c : customers) System.out.println(c);
		}
		catch (RoomException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
