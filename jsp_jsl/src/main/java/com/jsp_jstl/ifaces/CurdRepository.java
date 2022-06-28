package com.jsp_jstl.ifaces;
import java.util.*;

public interface CurdRepository<T> {
	
	public T add(T t);
     public List<T> findAll();
     public List<T>findAllByName(T bookName);
}
