package com.jsp_jstl;

import java.util.*;

import com.jsp_jstl.Book;
import com.jsp_jstl.ifaces.*;


import repos.BookRepository;
public class BookService {

	private CurdRepository<Book> repo;

	BookService() {
		super();

		this.repo = new BookRepository();

	}

	public List<Book> findAll() {
		
		this.repo.add(new Book(101,"java","james gosling",250.36));

		return this.repo.findAll();

	}

	public Book add(Book entity) {

		return this.repo.add(entity);
	}

}
