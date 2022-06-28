package com.practice.session;

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

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		System.out.println(action);

		switch (action) {
		case "/":
			Welcomepage(request, response);

			break;
		case "/add":
			addDetails(request, response);

			break;
		case "/ShowDetails":
			ShowDetails(request, response);

			break;

		default:
			break;
		}

	}

	private void ShowDetails(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		int roll = Integer.parseInt(request.getParameter("roll"));
		String studentname = request.getParameter("studentname");
		String degree = request.getParameter("degree");
		String subject[] = request.getParameterValues("subject");
		
		StudentDetails stu = new StudentDetails(roll,studentname,degree,subject);
		request.setAttribute("Student", stu);
		
		
		request.setAttribute("Welcome2", "View student Details");
		RequestDispatcher rd = request.getRequestDispatcher("/show.jsp");
		rd.forward(request, response);
		
		
		
	}

	private void addDetails(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("Welcome1", "Add student Details");
		RequestDispatcher rd = request.getRequestDispatcher("/Details.jsp");
		rd.forward(request, response);
	}

	private void Welcomepage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("Welcome", "Student login");
		RequestDispatcher rd = request.getRequestDispatcher("/Display.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
