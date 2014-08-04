package com.util;

import com.impl.RealDao;
import com.impl.RealMainframe;
import com.integration.Dao;
import com.integration.Mainframe;

public class ServiceLocator {
	
	public static Dao getDaoInstance(){
		return new RealDao();
	}
	
	public static Mainframe getMainframeInstance(){
		return new RealMainframe();
	}
}
