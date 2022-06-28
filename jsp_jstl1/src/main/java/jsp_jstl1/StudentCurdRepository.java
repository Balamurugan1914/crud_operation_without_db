package jsp_jstl1;

import java.util.List;

public interface StudentCurdRepository<B> {
	
	public B addStudentDetails(B b);
	public List<B> findAllStudentDetails();
	
	
	

}
