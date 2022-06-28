package com.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.curdrepository.CurdRepository;
import com.modelclass.Book;
public class BookRepositoryDb implements CurdRepository<Book> {

	private Connection con;

	public BookRepositoryDb(Connection con) { // To connection the class using paramaterized constructor
		super();
		this.con = con;
	}

	@Override
	public Book add(Book t) {

		String sq1 = "insert into bookss values(?,?,?,?)";
		int rowAdded = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sq1);
			ps.setInt(1, t.getBookNumber());
			ps.setString(2, t.getBookName());
			ps.setString(3, t.getAuthorName());
			ps.setDouble(4, t.getPrice());

			rowAdded = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return rowAdded == 1 ? t : null;
	}

	@Override
	public List<Book> findAll() {

		String sql = "select * from bookss";

		List<Book> booklist = new ArrayList<>();
		try {

			PreparedStatement print = con.prepareStatement(sql);

			ResultSet rs = print.executeQuery();
			while (rs.next()) {

				int bookNumber = rs.getInt("bookNumber");
				String bookName = rs.getString("bookName");
				String authorName = rs.getString("authorName");
				double price = rs.getDouble("price");

				Book eachBook = new Book(bookNumber, bookName, authorName, price);
				booklist.add(eachBook);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return booklist;
	}

	@Override
	public Book removeById(int id) {
		String sq1 = "delete from bookss where bookNumber = ?";
		int rowDeleted = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sq1);
			ps.setInt(1, id);

			rowDeleted = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return rowDeleted == 1 ? findById(id) : null;

	}

	public Book findById(int id) {

		String sql = "select * from bookss where bookNumber = ?";

		Book foundBook = null;
		try {

			PreparedStatement print = con.prepareStatement(sql);
			print.setInt(1, id);

			ResultSet rs = print.executeQuery();
			while (rs.next()) {

				int bookNumber = rs.getInt("bookNumber");
				String bookName = rs.getString("bookName");
				String authorName = rs.getString("authorName");
				double price = rs.getDouble("price");

				foundBook = new Book(bookNumber, bookName, authorName, price);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return foundBook;

	}

	public Book updateBook(Book t) {
		String sql = "update  bookss set bookName=?,authorName=?,price=? where bookNumber=?";
		int rowUpdated = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, t.getBookName());
			pstmt.setString(2, t.getAuthorName());
			pstmt.setDouble(3, t.getPrice());
			pstmt.setInt(4, t.getBookNumber());
			rowUpdated = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated == 1 ? t : null;

	}


	public List<Book> findByName(String bookName) {
		String sql = "select * from bookss where bookName = ?";

		List<Book> booklist = new ArrayList<>();
		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bookName);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				int bookNumber = rs.getInt("bookNumber");
			     //String bookName = rs.getString("bookName");
				String authorName = rs.getString("authorName");
				double price = rs.getDouble("price");

				Book eachBook = new Book(bookNumber, bookName, authorName, price);
				booklist.add(eachBook);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return booklist;

	}

}
