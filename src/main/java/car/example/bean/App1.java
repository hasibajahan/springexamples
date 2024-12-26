package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		//Application context is an interface, that plays the IoC container in spring, who manages the beans and the dependencies. 
		//ClassPathXmlApplictionContext is a specific implementation of the interface, who loads the context definition from an xml file,
		//this class is responsible for setting and configuring the spring container
		ApplicationContext context=new ClassPathXmlApplicationContext("car/example/bean/applicationBeanContext.xml");
		MyBean myBean=(MyBean) context.getBean("myBean",MyBean.class);//write the id in the parenthesis
		System.out.println(myBean);
	}
}
