package com.pack3;

public class Student implements Comparable<Student>{
	
	private int roll;
	private String name;
	private int marks;
	
	public Student() {}

	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		Student s1 = this;
		Student s2 = o;
		if(s1.getRoll() < s2.getRoll()) return 1;
		else if (s1.getRoll() > s2.getRoll()) return -1;
		return 0;
	}
	
	
	
	
	

}
