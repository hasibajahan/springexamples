package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	//field injection using autowired annotation
	
	@Autowired
	private Employee employee;
	
	
	//example of constructor injection using autowired annotation

//	@Autowired
//	public Manager(Employee employee) {
//		super();
//		this.employee = employee;
//	}

	@Override
	public String toString() {
		return "Manager [employee=" + employee + "]";
	}
	
}
