package com.appium.appiumUtils;

public class SQLQueries {

	public String leadidbymobilenumber(String mobilenumber) {

		String SELECT_LEADID_BY_MOBILENUMBER = "select id from leads l  WHERE phone_mobile='" + mobilenumber + "'";
		return SELECT_LEADID_BY_MOBILENUMBER;
	}

}
