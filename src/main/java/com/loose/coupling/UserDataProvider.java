package com.loose.coupling;


//whatever methods i'll be needing in order to interact with the database i can declare
//over here in this interface.
public interface UserDataProvider {
	String getUserDetails();
}
