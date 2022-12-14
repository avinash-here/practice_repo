package com.useCases;

import java.util.Scanner;

import com.dao.RoomDao;
import com.dao.RoomDaoImpl;
import com.exceptions.RoomException;
import com.models.Room;

public class AddRoom {
	
	public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Room Number");
		int roomNumber = sc.nextInt();
		
		System.out.println("Enter the Room type");
		String roomType = sc.next();
		
		System.out.println("Enter the Room price per night");
		int pricePerNight = sc.nextInt();
		
		System.out.println("Enter no of maximum person, who can live in the room");
		int maximumPerson = sc.nextInt();
		
		sc.close();
		
		Room r = new Room();
		
		r.setRoomNumber(roomNumber);
		r.setRoomType(roomType);
		r.setPricePerNight(pricePerNight);
		r.setMaximumPerson(maximumPerson);
		
		try {
			String message = rd.addRoom(r);
			
			System.out.println(message);
			
		} catch (RoomException re) {
			System.out.println(re.getMessage());
		}
		
		
	}

}
