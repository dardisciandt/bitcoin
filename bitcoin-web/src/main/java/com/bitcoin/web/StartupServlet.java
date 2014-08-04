package com.bitcoin.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class StartupServlet extends HttpServlet {

	private WebWallet ww;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		System.out.println("StartupServlet.init()");
		ww = new WebWallet("testnet3");
		ww.start();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		System.out.println("SaveUserProfile.doPost()");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		System.out.println("SaveUserProfile.doGet()");
		ww.sendCoins("mtP5rEfgm2WEX4o6poV6yojb47N5vSVDgw", "0.0009");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		System.out.println("StartupServlet.destroy()");
		ww.stop();
	}
}
