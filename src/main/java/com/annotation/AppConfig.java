package com.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //to specify that this class works as the configuration class.
@ComponentScan(basePackages = "com.annotation") //to tell spring to scan this package.

public class AppConfig {
	//It is the configuration class. This class won't have any method or field
	//purpose of this class is just to have the configuration

}

