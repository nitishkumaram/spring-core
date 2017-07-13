package com.employee.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
	}
}
