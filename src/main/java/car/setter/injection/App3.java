package car.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car/setter/injection/applicationSetterInjection.xml");
		Car1 mycar=context.getBean("myCar",Car1.class);
		mycar.displayDetails();
	}

}
