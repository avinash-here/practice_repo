package com.useCases;

import java.util.List;

import com.dao.RoomDao;
import com.dao.RoomDaoImpl;
import com.models.Room;

public class GetAllRooms {
	
	public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
		
		List<Room> rooms = rd.getAllRoomDetails();
		
		if(rooms.size() == 0) System.out.println("No Rooms Found!");
		else {
			for(Room r : rooms) System.out.println(r);
		}
		
	}

}
