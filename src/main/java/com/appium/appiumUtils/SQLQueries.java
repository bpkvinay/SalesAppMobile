package com.appium.appiumUtils;

public class SQLQueries {
	
	//public static final String SELECT_LEADID_BY_MOBILENUMBER="select id from leads l  WHERE phone_mobile='8191003423';";

	 public String leadidbymobilenumber(String mobilenumber) {
		 
        String SELECT_LEADID_BY_MOBILENUMBER="select id from leads l  WHERE phone_mobile='"+mobilenumber+"'";
        return SELECT_LEADID_BY_MOBILENUMBER;
	 }
	 
}
