package com.practice.session;

public class StudentDetails {
	
	private int roll;
	private String studentname;
	private String degree;
	private String[] subject;
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(int roll, String studentname, String degree, String[] subject) {
		super();
		this.roll = roll;
		this.studentname = studentname;
		this.degree = degree;
		this.subject = subject;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	
	
	

}
