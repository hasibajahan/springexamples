package com.tight.coupling;

// A - MySQL, postgreSQL
// B - Web Service, MongoDB


public class UserDatabase {
	//all the code that allows this application to interact with the database
		public String getUserDetails() {
			//directly access the database here
			return "user details from database";
		}
}
