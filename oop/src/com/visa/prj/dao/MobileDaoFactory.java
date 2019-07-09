package com.visa.prj.dao;

import java.util.ResourceBundle;

public class MobileDaoFactory {
	
	private static String NAME = "";
	
	
	// shall be executed only but surely once
	
	static {
		
		ResourceBundle res = ResourceBundle.getBundle("config");
		NAME = res.getString("MOBILE_DAO").trim();
	}

	public static MobileDao getMobileDao() {
//			return new MobileDaoMongoImpl();
		try {
			return (MobileDao) Class.forName(NAME).newInstance();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
