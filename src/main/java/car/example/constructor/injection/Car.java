package car.example.constructor.injection;

public class Car {
	//car class dependent on specification
	private Specification specification;
	
	
	public Car(Specification specification) {
		super();
		this.specification = specification;
	}


	public void displayDetails() {
		System.out.println("Car details: "+specification.toString());
	}
}
