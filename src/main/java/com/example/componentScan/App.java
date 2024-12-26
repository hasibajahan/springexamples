package com.example.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/example/componentScan/componentScanDemo.xml");
	Employee employee=context.getBean("employee1",Employee.class);
	System.out.println(employee.toString());
	}
}
