package com.curdinterface;

import java.util.List;

public interface StudentInterface<S> {
	
	public S insert(S s);
	public S update(S s);
	public S removeByRoll(int rollNumber);
	public List <S> findAll();
	
	
	
	
	

}
