

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Assessment1.Employee;
import Assessment1.EmployeeDBConection;
import Assessment21.PracticeEmployee1;

/**
 * Servlet implementation class PracticeEmployee1Servlet
 */
@WebServlet("/PracticeEmployee1Servlet")
public class PracticeEmployee1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PracticeEmployee1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		int empId=Integer.parseInt(request.getParameter("txtEmpId"));
		String name=request.getParameter("txtName");
		
		String salary =request.getParameter("txtSalary");
		
		Employee e=new Employee();
	
		
		e.setEmpId(empId);
		e.setName(name);
		
		e.setSalary(salary);
		
		int res = 0;
		
			try {
				res = PracticeEmployee1.insert(e);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//pw.print("data inserted succesfully");
		
		if(res>0)
		{
			pw.print("data saves successfully ");
			response.sendRedirect("intex.html");
		}
		else
		{
			pw.print("there is an problem to insert the data :");
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
