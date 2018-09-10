package com.java.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c=(Car)context.getBean("c");
		c.printcarnames();
		c.printenginenames();
	}
}
