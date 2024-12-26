package com.loose.coupling;

public class WebServiceDataProvider {
	public String getUserDetails() {
			//directly access the database here
			return "Fetching data from web service.";
		}
}
