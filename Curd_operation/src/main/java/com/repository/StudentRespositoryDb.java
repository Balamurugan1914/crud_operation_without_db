package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.curd.modalclass.StudentDetails;
import com.curdinterface.StudentInterface;

public class StudentRespositoryDb implements StudentInterface<StudentDetails> {

	private Connection con;

	public StudentRespositoryDb(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public StudentDetails insert(StudentDetails s) {

		String insert = "insert into student1 values(?,?,?,?)";

		int totalinserted = 0;
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, s.getRollNumber());
			ps.setString(2, s.getStudentName());
			ps.setString(3, s.getStudentDegree());
			ps.setInt(4, s.getStudentMarks());

			totalinserted = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return totalinserted == 1 ? s : null;
	}

	@Override
	public StudentDetails update(StudentDetails s) {

		return null;
	}

	@Override
	public StudentDetails removeByRoll(int rollNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDetails> findAll() {

		String list = "select * from student1";

		List<StudentDetails> viewlist = new ArrayList<StudentDetails>();

		try {

			PreparedStatement ps = con.prepareStatement(list);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int rollNumber = rs.getInt("rollNumber");
				String studentName = rs.getString("studentName");
				String StudentDegree = rs.getString("StudentDegree");
				int studentMarks = rs.getInt("studentMarks");

				StudentDetails studentlist = new StudentDetails(rollNumber, studentName, StudentDegree, studentMarks);

				viewlist.add(studentlist);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return viewlist;
	}

}
