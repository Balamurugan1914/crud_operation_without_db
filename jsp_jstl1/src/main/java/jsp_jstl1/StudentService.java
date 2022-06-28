package jsp_jstl1;

import java.util.List;

import Repository.StudentRepository;

public class StudentService  {
	private StudentCurdRepository<Student> studentrepo;
	

	public StudentService() {
		super();
		this.studentrepo = new StudentRepository();
	}


	public Student addStudentDetails(Student Entry) {
		
		return this.studentrepo.addStudentDetails(Entry);
		
		
	}


	public List<Student> findAllStudentDetails() {
		
		return this.studentrepo.findAllStudentDetails();
	}

	

}
