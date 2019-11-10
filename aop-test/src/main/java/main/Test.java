package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.Cats;
import data.Dog;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config/test.xml");
		Cats c = (Cats)context.getBean("myCat");
		Dog g = (Dog)context.getBean("dog");
		c.getCatsInfo();
		g.print();
		
	}

}
