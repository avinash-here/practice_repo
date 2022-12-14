package com.useCases;

import java.util.Scanner;

import com.dao.RoomDao;
import com.dao.RoomDaoImpl;
import com.exceptions.RoomException;
import com.models.Room;

public class GetRoomByRoomType {
	
	public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the Room type");
		String roomType = sc.next();		
		
		sc.close();		
		
		try {
			Room room = rd.getRoomByRoomType(roomType);
			
			System.out.println(room);
			
		} catch (RoomException re) {
			System.out.println(re.getMessage());
		}
		
		
	}

}
