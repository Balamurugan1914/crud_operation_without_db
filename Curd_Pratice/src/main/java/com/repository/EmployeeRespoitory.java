package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.curdinterface.EmployeeInterface;
import com.modalclass.Employee;

public class EmployeeRespoitory implements EmployeeInterface<Employee> {

	private Connection con = null;

	public EmployeeRespoitory(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Employee add(Employee e) {

		String insert = "insert into vastemployee values(?,?,?,?)";

		int added = 0;

		try {

			PreparedStatement ps = con.prepareStatement(insert);

			ps.setInt(1, e.getId());
			ps.setString(2, e.getEmployeeName());
			ps.setString(3, e.getEmployeeDesignation());
			ps.setInt(4, e.getSalary());

			added = ps.executeUpdate();

		} catch (Exception e1) {
			System.out.println(e1);
		}

		return added == 1 ? e : null;

	}

	@Override
	public List<Employee> findAll() {

		String booklist = "select * from vastemployee";

		List<Employee> list = new ArrayList<Employee>();
		try {

			PreparedStatement ps = con.prepareStatement(booklist);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");
				String employeeName = rs.getString("employeeName");
				String employeeDesignation = rs.getString("employeeDesignation");
				int marks = rs.getInt("marks");

				list.add(new Employee(id, employeeName, employeeDesignation, marks));

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;

	}

}
