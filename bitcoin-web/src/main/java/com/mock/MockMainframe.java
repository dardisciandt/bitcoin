package com.mock;

import java.util.Date;

import com.integration.Mainframe;

public class MockMainframe implements Mainframe {

	public String sendMessage(String input) {

		System.out.println("MockMainframe.sendMessage()" + input);
		
		return new Date().toString();
	}

}
