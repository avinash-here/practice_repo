package com.ques5;

public class Student {
	private int roll;
	private String name;
	private String address; 
	private String dateOfBirth;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String address, String dateOfBirth) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
	
	

}
