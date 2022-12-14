package com.useCases;

import java.util.List;
import java.util.Scanner;

import com.dao.RoomDao;
import com.dao.RoomDaoImpl;
import com.exceptions.RoomException;
import com.models.Room;

public class GetEmptyRooms {
	
	public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
				
		try {
			List<Room> room = rd.getEmptyRooms();
			
			System.out.println(room);
			
		} catch (RoomException re) {
			System.out.println(re.getMessage());
		}
		
		
	}

}
