package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ConnectionSource;
import com.modalclass.Employee;
import com.service.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Connection con = null;
	public EmployeeService serv = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		try {

			con = ConnectionSource.getConnection();
			
			serv = new EmployeeService(con);

			System.out.println("connection - " + con);

		} catch (Exception e) {
			
			

			e.printStackTrace();

		}

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String key = request.getServletPath();
		System.out.println(key);
		
		switch (key) {
		case "/insert": addDetails(request,response);
			
		
			break;
		case "/view": viewDetails(request,response);
		
		
		break;

		default:
			break;
		}
	}

	private void viewDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
	 List<Employee> employee = serv.viewAll();
	 
	 request.setAttribute("view", employee);
	 RequestDispatcher dispatcher = request.getRequestDispatcher("/showdetails.jsp");
		dispatcher.forward(request, response);
	 
		
		
	}

	private void addDetails(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		String employeeName = request.getParameter("employeeName");
		String employeeDesignation = request.getParameter("employeeDesignation");
		int salary = Integer.parseInt(request.getParameter("salary"));
		
		Employee input = new Employee(id, employeeName, employeeDesignation, salary);
		Employee added = serv.add(input);
		
		request.setAttribute("alert", "added successfully");
		
		request.setAttribute("added", added);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addemployee.jsp");
		dispatcher.forward(request, response);
		
	}

}
