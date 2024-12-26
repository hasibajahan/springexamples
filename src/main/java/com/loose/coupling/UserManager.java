package com.loose.coupling;

public class UserManager {

//	private UserDataProvider userDataProvider;
//
//	public UserManager(UserDataProvider userDataProvider) {
//		super();
//		this.userDataProvider = userDataProvider;
//	}
//
//	public String getUserInfo() {
//		return userDataProvider.getUserDetails();
//	}

	
	//using spring framework
	//injecting dependency using constructor injection
	private WebServiceDataProvider webServiceDataProvider;  
	private UserDatabaseProvider userDatabaseProvider;
	
	public UserManager(WebServiceDataProvider webServiceDataProvider, UserDatabaseProvider userDatabaseProvider) {
		super();
		this.webServiceDataProvider = webServiceDataProvider;
		this.userDatabaseProvider = userDatabaseProvider;
	}

	@Override
	public String toString() {
		return "UserManager [webServiceDataProvider=" + webServiceDataProvider.getUserDetails() + ", userDatabaseProvider="
				+ userDatabaseProvider.getUserDetails() + "]";
	}

//	public UserManager(WebServiceDataProvider webServiceDataProvider) {
//	super();
//	this.webServiceDataProvider = webServiceDataProvider;
//}
	
//	public String getUserInfo() {
//		return webServiceDataProvider.getUserDetails();
//	}
	
}
