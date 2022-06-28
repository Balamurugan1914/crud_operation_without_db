package repos;

import java.util.*;

import com.jsp_jstl.Book;
import com.jsp_jstl.ifaces.CurdRepository;
public class BookRepository implements CurdRepository<Book> {

	private List<Book> bookList;

	public BookRepository() {
		super();
		this.bookList = new ArrayList<Book>();
	}

	@Override
	public Book add(Book t) {
		
	Boolean isAdded	=this.bookList.add(t);
	if(isAdded) {
		return t;
	}else {
		return null;
	}
		
		
		
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public List<Book> findAllByName(Book bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	

	


	

	
	

	

}
