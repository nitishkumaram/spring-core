package com.spaneos.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("greetings.xml");
		Greetings obj= (Greetings) context.getBean("greetings");
		
		obj.printGreetings();
	}
}
