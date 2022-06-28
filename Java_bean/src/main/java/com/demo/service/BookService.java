
package com.demo.service;

import java.sql.Connection;

import java.util.*;

import com.modelclass.Book;

import com.repository.BookRepositoryDb;
import com.curdrepository.*;
public class BookService {

	private CurdRepository<Book> repo;
	private Connection con;

	public BookService(Connection con) {
		super();
		this.con = con;
		this.repo = new BookRepositoryDb(con);

	}

	public List<Book> findAll() {

		

		return this.repo.findAll();

	}

	public Book add(Book entity) {

		return this.repo.add(entity);
	}

	public Book remove(int id) {
		return this.repo.removeById(id);
	}

	public Book findById(int id) {
		return this.repo.findById(id);
	}

	public Book Update(Book id) {

		return this.repo.updateBook(id);

	}

	public Book findBookById(int id) {
		return this.repo.findById(id);
	}
	public List<Book> findByName(String bookName) {
		return this.repo.findByName(bookName);
	}

}
