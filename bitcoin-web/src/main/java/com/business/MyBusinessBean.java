package com.business;

import com.integration.Dao;
import com.integration.Mainframe;
import com.util.ServiceLocator;

public class MyBusinessBean {
	
	private Dao dao;
	private Mainframe mainframe;
	
	public void businessMethod(){
		getDao().loadCustomers();
		getMainframe().sendMessage("ola");
	}
	
	public Integer businessOperation(Integer i){

		if(i == 1)
			return 1;
		if(i == 2)
			return 2;
		if(i == 3)
			return 3;
		if(i == 4)
			return 4;
		if(i == 5)
			return 5;
		if(i == 6)
			return 6;
		if(i == 7)
			return 7;
		if(i == 8)
			return 8;
		if(i == 9)
			return 9;
		if(i == 10)
			return 10;

		return 0;
	}
	
	public Dao getDao() {
		if(dao == null){
			dao = ServiceLocator.getDaoInstance();
		}
		
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	public Mainframe getMainframe() {
		if(mainframe == null){
			mainframe = ServiceLocator.getMainframeInstance();
		}
		
		return mainframe;
	}
	public void setMainframe(Mainframe mainframe) {
		this.mainframe = mainframe;
	}
}
