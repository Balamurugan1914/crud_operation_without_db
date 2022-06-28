package jsp_jstl1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		
		service = new StudentService();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String urlaction = request.getServletPath();
		System.out.println(urlaction);
		
		switch (urlaction) {
		case "/":
		    homePage(request,response);
			break;
		case "/add":
		    addPage(request,response);
			break;
		case "/find":
		    viewPage(request,response);
			break;

		default:
			break;
		}
		
		
	}

	private void viewPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		
		
	}

	private void addPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		 request.setAttribute("student", "Add Student Details");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addstudent.jsp");
        dispatcher.forward(request, response);
		
		
	}

	private void homePage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	        request.setAttribute("student", "Welcome to Student Portal");
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
	        dispatcher.forward(request, response);
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
