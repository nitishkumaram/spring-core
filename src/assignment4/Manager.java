package assignment4;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.context.ConfigurableApplicationContext;

public class Manager {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("assignment4.xml");
		
		DbConnection connection=(DbConnection) context.getBean("dbobject");
		
		System.out.println(connection.getDbConnection());
		
		context.close();
		
	}
}
