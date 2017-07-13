package com.lazy.initialization.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Manager {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("lazy-employee.xml");
		Employee obj= (Employee) context.getBean(Employee.class);
	}
}
