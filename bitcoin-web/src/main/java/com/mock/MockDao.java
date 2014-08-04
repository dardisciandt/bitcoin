package com.mock;

import java.util.ArrayList;
import java.util.List;

import com.integration.Dao;

public class MockDao implements Dao{

	public List<String> loadCustomers() {
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("daniel");
		l.add("dardis");
		
		return l;
	}

}
