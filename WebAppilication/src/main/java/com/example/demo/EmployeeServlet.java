package com.example.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String action = request.getServletPath();
		//System.out.println(action);
		switch (action) {
		case "/":
			System.out.println("save");
		
		case "/add1":
			addEmployee(request, response);
			break;
		case "/show1":
			ShowEmployee(request, response);
			break;

		default:
			break;
		}

	}

	private void ShowEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String[] hobbies = request.getParameterValues("hb");
		String qualification = request.getParameter("rd");
		System.out.println(qualification);
		System.out.println(lastname);

		Employee emp = new Employee(firstname, lastname, hobbies, qualification);
		request.setAttribute("Employee", emp);
		RequestDispatcher rd = request.getRequestDispatcher("/Employee.jsp");
		rd.forward(request, response);

	}

	private void addEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/Option.jsp");
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
