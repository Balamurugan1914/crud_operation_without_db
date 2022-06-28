package com.service;

import java.sql.Connection;
import java.util.List;

import com.curd.modalclass.StudentDetails;
import com.curdinterface.StudentInterface;
import com.repository.StudentRespositoryDb;

public class StudentService {

	private StudentInterface<StudentDetails> stu;
	private Connection con;

	public StudentService(Connection con) {
		super();
		this.con = con;
		this.stu = new StudentRespositoryDb(con);
	}

	public StudentDetails add(StudentDetails enterdetails) {

		return this.stu.insert(enterdetails);

	}

	public StudentDetails update(StudentDetails enterdetails) {
		return this.stu.update(enterdetails);

	}
	
	public List<StudentDetails> viewall(){
		
		return this.stu.findAll();
		
		
	}

}
