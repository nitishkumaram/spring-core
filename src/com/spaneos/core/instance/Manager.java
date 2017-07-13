package com.spaneos.core.instance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean-instance.xml");
		DbConnection connection=context.getBean(DbConnection.class);
		
	}
}
