package com.service;

import java.sql.Connection;
import java.util.List;

import com.curdinterface.EmployeeInterface;
import com.modalclass.Employee;
import com.repository.EmployeeRespoitory;

public class EmployeeService {

	private Connection con = null;

	private EmployeeInterface<Employee> emp = null;

	public EmployeeService(Connection con) {
		super();
		this.con = con;
		this.emp = new EmployeeRespoitory(con);
	}

	public Employee add(Employee entry) {

		return this.emp.add(entry);

	}
	
	public List<Employee> viewAll(){
		
		return this.emp.findAll();
		
	}

}
