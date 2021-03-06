package com.curd.modalclass;

public class StudentDetails {

	private int rollNumber;
	private String studentName;
	private String StudentDegree;
	private int studentMarks;

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public StudentDetails(int rollNumber, String studentName, String studentDegree, int studentMarks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		StudentDegree = studentDegree;
		this.studentMarks = studentMarks;
	}



	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDegree() {
		return StudentDegree;
	}

	public void setStudentDegree(String studentDegree) {
		StudentDegree = studentDegree;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "StudentDetails [rollNumber=" + rollNumber + ", studentName=" + studentName + ", StudentDegree="
				+ StudentDegree + ", studentMarks=" + studentMarks + "]";
	}

}
