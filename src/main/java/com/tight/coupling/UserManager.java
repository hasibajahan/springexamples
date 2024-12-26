package com.tight.coupling;

public class UserManager {
	//responsible for managing all the user informations
	private UserDatabase userDatabase=new UserDatabase();
	public String getUserInfo() {
		return userDatabase.getUserDetails();	
	}
	
}
