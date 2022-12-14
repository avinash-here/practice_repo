package com.useCases;

import java.util.List;
import java.util.Scanner;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exceptions.RoomException;
import com.models.Customer;

public class AddCustomerToRoom {
	
	public static void main(String[] args) {
		
		CustomerDao cd = new CustomerDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Id :");
		int customId = sc.nextInt();
		
		System.out.println("Enter the Customer Name :");
		String customName = sc.next();
		
		System.out.println("Enter the Customer Address :");
		String addr = sc.next();
		
		System.out.println("Enter the Room Number :");
		int roomNo = sc.nextInt();
		
		Customer custom = new Customer();
		custom.setCustomerId(customId);
		custom.setCustomerName(customName);
		custom.setAddress(addr);
				
		try {
			String message = cd.addCustomerToRoom(custom, roomNo);
			System.out.println(message);
		}
		catch (RoomException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
