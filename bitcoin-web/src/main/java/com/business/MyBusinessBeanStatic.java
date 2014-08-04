package com.business;

import com.util.JmsService;

public class MyBusinessBeanStatic {
	
	public void businessMethod(){
		// executa qualquer coisa aqui
		
		// static call a ser mockada (metodo original dispara uma exception)
		JmsService.enviarMensagem("msg");
		
		// executa qualquer coisa aqui também
	}
	
}
