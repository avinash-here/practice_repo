package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.RoomException;
import com.models.Customer;
import com.utility.DBUtil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String addCustomerToRoom(Customer customer, int roomNumber) throws RoomException {
		String message = "Customer Not Added";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from rooms where roomNumber = ?");
			ps.setInt(1, roomNumber);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				if(rs.getBoolean("isEmpty") == false) throw new RoomException("Room is not Empty!");
				
				PreparedStatement ps1 = conn.prepareStatement("select * from customer where customerId = ?");
				ps1.setInt(1, customer.getCustomerId());
				
				ResultSet rs1 = ps1.executeQuery();
				
				if(!rs1.next()) {			
				
					PreparedStatement ps2 = conn.prepareStatement("insert into customer values(?, ?, ?, null)");
					ps2.setInt(1, customer.getCustomerId());
					ps2.setString(2, customer.getCustomerName());
					ps2.setString(3, customer.getAddress());
					
					ps2.executeUpdate();
				}
				
					PreparedStatement ps3 = conn.prepareStatement("update customer set roomNumber = ? "
							+ "where customerId = ?");
					
					PreparedStatement ps4 = conn.prepareStatement("update rooms set isEmpty = false "
							+ "where roomNumber = ?");
					
					ps3.setInt(1, roomNumber);
					ps3.setInt(2, customer.getCustomerId());
					ps4.setInt(1, roomNumber);
									
					int out = ps3.executeUpdate();
					ps4.executeUpdate();
					
					if(out > 0) message = "Customer Added Successfully";

			}
			else {
				throw new RoomException("Invalid Room Number");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

	
	
	@Override
	public String removeCustomerFromRoom(int customerId, int roomNumber) throws RoomException {
		String message = "Customer Not Removed";
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("Update customer set roomNumber = null where customerId = ?");
			ps.setInt(1, customerId);			
			
			int out = ps.executeUpdate();
			
			if(out > 0) message = "Customer Removed";
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return message;
	}

	
	
	@Override
	public List<Customer> getCustomerFromParticularRoom(int roomNumber) throws RoomException {
		List<Customer> customs = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where roomNumber = ?");
			ps.setInt(1, roomNumber);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int custId = rs.getInt("customerId");
				String custName = rs.getString("customerName");
				String address = rs.getString("address");
				
				Customer c = new Customer(custId, custName, address, roomNumber);
				customs.add(c);
			}
			
			if(customs.size() == 0) throw new RoomException("This room doesn't have any customer!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customs;
	}

}
