package com.useCases;

import java.util.Scanner;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exceptions.RoomException;
import com.models.Customer;

public class RemoveCustomerFromRoom {
	
	public static void main(String[] args) {
		
		CustomerDao cd = new CustomerDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Id :");
		int customId = sc.nextInt();
				
		System.out.println("Enter the Room Number :");
		int roomNo = sc.nextInt();
						
		try {
			String message = cd.removeCustomerFromRoom(customId, roomNo);
			System.out.println(message);
		}
		catch (RoomException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
