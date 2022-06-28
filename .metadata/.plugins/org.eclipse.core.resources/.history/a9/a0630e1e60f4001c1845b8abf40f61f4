package com.training.connection;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.BookService;
import com.modelclass.Book;
import com.training.util.ConnectionFactory;

/**
 * Servlet implementation class BooksServlet
 */
@WebServlet("/")
public class BooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con = null;
	private BookService service = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BooksServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {

		super.init();
		try {
			con = ConnectionFactory.getpostgresqlconnection();
			service = new BookService(con);

			System.out.println("Connection= " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String key = request.getServletPath();

		System.out.println(key);
		switch (key) {
		case "/books":
			handlefindAll(request, response);
			break;
		case "/delete":
			handleRemove(request, response);
			break;
		case "/edit":
			handleEdit(request, response);
			break;
		case "/byname":
			handleName(request, response);
			break;
		default:
			break;
		}

	}

	private void handleName(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
		
		String bookName = request.getParameter("bookName");
		List<Book> book = service.findByName(bookName);
		
		request.setAttribute("book", book);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showbook.jsp");
		dispatcher.forward(request, response);
		
	}

	public void handleRemove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);
		Book book = service.remove(id);
		List<Book> books = service.findAll();
		request.setAttribute("book", books);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/showbook.jsp");
		dispatcher.forward(request, response);
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
		case "/update":
			handleUpdate(request, response);
			break;
		case "/add":
			handleInsert(request, response);
			break;
		default:
			break;
		}

	}

	private void handleInsert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bookNumber = Integer.parseInt(request.getParameter("bookNumber"));
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		double price = Double.parseDouble(request.getParameter("price"));

		Book entity = new Book(bookNumber, bookName, authorName, price);
		Book addedBook = service.add(entity);

		request.setAttribute("added", addedBook);
		request.setAttribute("message", "one book added");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addbook.jsp");
		dispatcher.forward(request, response);

	}

	public void handlefindAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> books = service.findAll();

		request.setAttribute("book", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showbook.jsp");
		dispatcher.forward(request, response);

	}

	private void handleEdit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);

		Book bookToEdit = service.findBookById(id);
		request.setAttribute("bookToEdit", bookToEdit);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addbook.jsp");
		dispatcher.forward(request, response);
	}

	private void handleUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strBookNumber = request.getParameter("bookNumber");
		int bookNumber = Integer.parseInt(strBookNumber);
		String bookName = request.getParameter("bookName");
		String authorName = request.getParameter("authorName");
		String strPrice = request.getParameter("price");
		double price = Double.parseDouble(strPrice);
		Book entity = new Book(bookNumber, bookName, authorName, price);
		Book bookUpdate = service.Update(entity);
		request.setAttribute("update", bookUpdate);
		if (bookUpdate != null) {
			request.setAttribute("message", "One book updated");
		} else {
			request.setAttribute("message", "Error in updating book");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addbook.jsp");
		dispatcher.forward(request, response);

	}

}
