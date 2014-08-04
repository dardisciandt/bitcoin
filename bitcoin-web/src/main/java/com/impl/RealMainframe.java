package com.impl;

import com.integration.Mainframe;

public class RealMainframe implements Mainframe {

	public String sendMessage(String input) {
		if(true)
			throw new RuntimeException("Database not available");
		
		return null;
	}

}
