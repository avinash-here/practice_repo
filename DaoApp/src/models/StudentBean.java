package models;

public class StudentBean {

	private int roll;
	private String name;
	private int marks;
	
	public StudentBean() {}
	
	public StudentBean(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
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
		return "StudentBean [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
