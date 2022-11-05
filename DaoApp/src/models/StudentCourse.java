package models;

public class StudentCourse {
	
	private int courseId;
	private String courseName;
	private int fee;
	private String duration;
	
	public StudentCourse() {}

	public StudentCourse(int courseId, String courseName, int fee, String duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "StudentCourse [courseId=" + courseId + ", courseName=" + courseName + ", fee=" + fee + ", duration="
				+ duration + "]";
	}
	
	

}
