package com.example.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeServlet() {
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
		// System.out.println("action path -"+action);
		switch (action) {
		case "/WelcomeServlet":
			Welcomepage(request, response);
			break;
		case "/add":
			Addpage(request, response);
			break;
		case "/show":
			Showpage(request, response);
			break;

		default:
			break;
		}

	}

	private void Showpage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("Heading", "Gandhi_school");

		int rollNumber = Integer.parseInt(request.getParameter("Rollnumber"));
		String name = request.getParameter("name");
		Double marks = Double.parseDouble(request.getParameter("marks"));

		Student stu = new Student(rollNumber, name, marks);
		request.setAttribute("Student", stu);

		RequestDispatcher rd = request.getRequestDispatcher("/ShowStudent.jsp");
		rd.forward(request, response);

	}

	private void Addpage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("Heading", "Gandhi_school");
		RequestDispatcher rd = request.getRequestDispatcher("/Add.jsp");
		rd.forward(request, response);

	}

	private void Welcomepage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("Heading", "Gandhi_school");
		RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
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
