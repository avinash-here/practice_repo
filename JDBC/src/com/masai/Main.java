package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of the students you want to delete");
		int marks = sc.nextInt();
		
//		System.out.println("Enter the Name");
//		String name = sc.next();
//		
//		System.out.println("Enter the Address");
//		String address = sc.next();
//		
//		System.out.println("Enter the marks");
//		int marks = sc.nextInt();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20block20";
		
		try {
			Connection connect = DriverManager.getConnection(url, "root", "Avinash@0241");
			
			if(connect != null) System.out.println("Connection Established!");
			else System.out.println("Connection not established!");
			
			PreparedStatement ps = connect.prepareStatement("update student set marks = 500 where marks < ?");
			ps.setInt(1, marks);
//			ps.setString(2, name);
//			ps.setString(3, address);
//			ps.setInt(4, marks);
			
			int i = ps.executeUpdate();
			
			if(i > 0) System.out.println(i + " Students deleted!");
			else System.out.println("Student data Deletion Failed!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
