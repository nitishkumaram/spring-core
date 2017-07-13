package assignment1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccessProduct {
public static void main(String[] args) {
	
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("assignment1.xml");
	Product p=(Product) context.getBean("productobj");
	System.out.println(p);
	context.close();
	
}
}
