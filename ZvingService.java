package com.in28minutes.service.api;

import com.in28minutes.domain.Zving;


public interface ZvingService {

	
	Zving getZvingByEmail(final String email);

	
	boolean isValidZving(final String email, final String password);

	
	Zving create(final Zving zving);

	
	Zving update(Zving zving);

	
	void remove(final Zving zving);
}