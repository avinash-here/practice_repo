package com.dao;

import java.util.List;

import com.exceptions.RoomException;
import com.models.Customer;

public interface CustomerDao {
	
	public String addCustomerToRoom(Customer customer, int roomNumber)throws RoomException;
	
	public String removeCustomerFromRoom(int customerId, int roomNumber)throws RoomException;
	
	public List<Customer> getCustomerFromParticularRoom(int	roomNumber) throws RoomException;

}
