package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ConnectionUnit;
import com.curd.modalclass.StudentDetails;
import com.service.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con = null;
	private StudentService service = null;
   

	/**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
			
			con = ConnectionUnit.getPostConnection();
		    service = new StudentService(con);
			
			System.out.println("Connection - "+con);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String key = request.getServletPath();
		System.out.println(key);
		switch (key) {
           case "/":
			
			homePage(request,response);
			
			break;
		
         case "/find":
			
				viewDetails(request,response);
			
			break;
			

		default:
			break;
		}
		
	}
		
		
		
		private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			request.setAttribute("home","Admission open");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
			dispatcher.forward(request, response);
			
		}

		private void viewDetails(HttpServletRequest request, HttpServletResponse response) {
			// TODO Auto-generated method stub
			
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String key = request.getServletPath();
		System.out.println(key);
		switch (key) {
       
		case "/add":
			
			addDetails(request,response);
			
			break;
  
			default:
			break;
		}
		
		
		
		
	}

	

	private void addDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		String studentName = request.getParameter("studentName");
		String studentDegree = request.getParameter("studentDegree");
		int studentMarks = Integer.parseInt(request.getParameter("studentMarks"));
		
		StudentDetails entry = new StudentDetails(rollNumber, studentName, studentDegree, studentMarks);
		StudentDetails added = service.add(entry);
		
		request.setAttribute("inserted", added);
		request.setAttribute("message", "one book added");
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adddetails.jsp");
		dispatcher.forward(request, response);
		
	}

}
