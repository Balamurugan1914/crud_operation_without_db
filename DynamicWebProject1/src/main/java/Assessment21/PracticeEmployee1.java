package Assessment21;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Assessment1.Employee;
import Assessment1.EmployeeDBConection;

public class PracticeEmployee1 {
	
	public static int insert(Employee e) throws SQLException
	{
		
		String INSERT="insert into employee1 (empid,name,salary) values(?,?,?);";
		int res=0;
		try
		{
		Connection con =EmployeeDBConection.getConnection();
		
		PreparedStatement ps=con.prepareStatement(INSERT);
		
		ps.setInt(1, e.getEmpId());
		ps.setString(2,e.getName());
		
		ps.setString(3, e.getSalary());
	
		res=ps.executeUpdate();
		//ps.close();
		con.close();
		}
		catch (Exception e1) {
			e1.printStackTrace();
			
		}
		return res;
	}

	

}
