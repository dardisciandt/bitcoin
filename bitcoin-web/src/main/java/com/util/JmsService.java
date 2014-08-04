package com.util;

public class JmsService {

	private JmsService(){
		
	}
	
	public static void enviarMensagem(String msg) {
		boolean test = true;
		
		if (test)
			throw new RuntimeException("JMS server not available");
	}
}
