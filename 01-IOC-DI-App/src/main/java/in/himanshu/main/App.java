package in.himanshu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.himanshu.beans.Car;

public class App {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
	Car car = context.getBean(Car.class);
	car.drive();
	
	}

}
