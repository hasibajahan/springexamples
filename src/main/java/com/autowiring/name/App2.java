package com.autowiring.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context 
					= new ClassPathXmlApplicationContext("com/autowiring/name/autowireByName.xml");
		Car mycar = context.getBean("myCar", Car.class);
		mycar.displayDetails();
	}

}
