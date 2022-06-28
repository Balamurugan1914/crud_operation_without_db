package com.curdinterface;

import java.util.List;

public interface EmployeeInterface<E> {
	
	public E add(E e);
	public List<E> findAll();
	

}
