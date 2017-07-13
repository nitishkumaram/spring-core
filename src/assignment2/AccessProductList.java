package assignment2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccessProductList {
public static void main(String[] args) {
	
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("assignment2.xml");
	ProductListClass p=(ProductListClass) context.getBean("productlist");
	System.out.println(p);
	context.close();
	
}
}
