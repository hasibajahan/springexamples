package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car/example/constructor/injection/applicationConstructorInjection.xml");
		Car mycar=context.getBean("myCar",Car.class);
		mycar.displayDetails();
	}

}
