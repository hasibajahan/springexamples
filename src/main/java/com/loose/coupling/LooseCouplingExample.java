package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
	public static void main(String args[]) {
//	UserDataProvider databaseProvider=new UserDatabaseProvider();
//	UserManager userManagerWithDB=new UserManager(databaseProvider);
//	System.out.println(userManagerWithDB.getUserInfo());
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com/loose/coupling/config.xml");
	UserManager userManager=context.getBean("userManager",UserManager.class); 
//	System.out.println(userManager.getUserInfo());
	System.out.println(userManager.toString());
	}
} 