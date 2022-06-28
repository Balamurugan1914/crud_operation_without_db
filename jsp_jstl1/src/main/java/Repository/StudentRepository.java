package Repository;

import java.util.ArrayList;
import java.util.List;

import jsp_jstl1.Student;
import jsp_jstl1.StudentCurdRepository;

public class StudentRepository implements StudentCurdRepository<Student> {

	private ArrayList<Student> studentlist;

	public StudentRepository() {
		super();

		this.studentlist = new ArrayList<Student>();

	}

	@Override
	public Student addStudentDetails(Student b) {

		boolean isAdded = this.studentlist.add(b);
		if (isAdded) {
			return b;

		}else {
			return null;
		}

	}

	@Override
	public List<Student> findAllStudentDetails() {
		
		return this.studentlist;
	}

}
