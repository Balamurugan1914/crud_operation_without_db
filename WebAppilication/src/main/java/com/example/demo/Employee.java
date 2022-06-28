package com.example.demo;


public class Employee {

	private String firstname;
	private String lastname;
	private String[] hobbies;
	private String qualification;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname, String[] hobbies, String qualification) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.qualification = qualification;
	}

	
//	@Override
//	public String toString() {
//		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", hobbies=" + Arrays.toString(hobbies)
//				+ ", qualification=" + qualification + "]";
//	}

}
