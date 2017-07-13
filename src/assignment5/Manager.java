package assignment5;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("assignment5.xml");

		int j=0;
		String type=null;
		Service s=(Service) context.getBean("factory");
		Employee e=null;
		Scanner sc=new Scanner(System.in);
		try{
			do{
				System.out.println("\n1. Developer Rules\n2. Trainer Rules\n3. Trainee Rules\n Enter Choice");
				int i=sc.nextInt();
				switch (i) {

				case 1: type="developer";
				break;

				case 2: type="trainer";
				break;

				case 3: type="trainee";
				break;

				default:
					System.out.println("Wrong Input!");
					break;
				}
				e=s.getEmployee(type);
				e.dispalyrules();
				System.out.println(" To Continue Press 1 or 0 to Break");
				j=sc.nextInt();
			}while(j!=0);
		}
		catch (InputMismatchException e1) {
			System.out.println(" Enter Digits Only!");
		}

		finally{
			context.close();
			sc.close();
		}
	}
}
