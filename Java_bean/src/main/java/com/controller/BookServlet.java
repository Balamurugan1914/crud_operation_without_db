package com.controller;

import java.util.List;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.BookService;
import com.modelclass.Book;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/book")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookService service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		service = new BookService(null);

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
		System.out.println(action);
		switch (action) {
		case "/":
			showIndex(request, response);

		case "/addBook":
			addBook(request, response);

			break;
		case "/findBook":
			findBook(request, response);

			break;

		default:
			break;
		}

	}

	private void findBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> bookList = service.findAll();
		request.setAttribute("book", bookList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showbook.jsp");
		dispatcher.forward(request, response);
	}

	private void addBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addbook.jsp");
		dispatcher.forward(request, response);
	}

	private void showIndex(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("Books", "Welcome to Book Store");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/homebook.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int rollNumber = Integer.parseInt(request.getParameter("bookNumber"));
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		double price = Double.parseDouble(request.getParameter("price"));

		Book entity = new Book(rollNumber, bookName, authorName, price);
		Book addedBook = service.add(entity);

		request.setAttribute("added", addedBook);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
		dispatcher.forward(request, response);

	}

}
