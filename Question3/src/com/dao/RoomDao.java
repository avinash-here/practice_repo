package com.dao;

import java.util.List;

import com.exceptions.RoomException;
import com.models.Room;

public interface RoomDao {
	
	public String addRoom(Room room) throws RoomException;
	
	public Room getRoomByRoomType(String name)throws RoomException;
	
	public List<Room> getEmptyRooms()throws RoomException;
	
	public List<Room> getAllRoomDetails();

}
