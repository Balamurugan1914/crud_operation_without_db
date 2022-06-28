package com.curdrepository;
import java.util.*;

public interface CurdRepository<T> {
	
	 public T add(T t);
     public List<T> findAll();
     public List<T>findByName(String bookName);
     public T removeById(int id);
     public T findById(int id);
     public T updateBook(T t);
     
    
}
