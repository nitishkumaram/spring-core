package assignment3;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("assignment3.xml");
		Employee emp=context.getBean(Employee.class);
		System.out.println(emp);
		context.close();
	}
}
