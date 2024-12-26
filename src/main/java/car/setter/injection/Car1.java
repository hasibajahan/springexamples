package car.setter.injection;

public class Car1 {
	// car1 class dependent on specification
	private Specification specification;

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public void displayDetails() {
		System.out.println("Car details: " + specification.toString());
	}
}
