package com.autowiring.name;

public class Car {
	// car class dependent on specification
	private Specification specification;

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public void displayDetails() {
		System.out.println("Car details: " + specification.toString());
	}
}
