package com.impl;

import java.util.List;

import com.integration.Dao;

public class RealDao implements Dao {

	public List<String> loadCustomers() {
		if(true)
			throw new RuntimeException("Database not available");
		
		return null;
	}
}
