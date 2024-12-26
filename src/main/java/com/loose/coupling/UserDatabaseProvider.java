package com.loose.coupling;

// A - MySQL, postgreSQL
// B - Web Service, MongoDB


public class UserDatabaseProvider {
	
	public String getUserDetails() {
			//directly access the database here
			return "user details from database";
		}
}
