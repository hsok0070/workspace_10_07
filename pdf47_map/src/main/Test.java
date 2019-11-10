package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javac.Baz;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/NewFile.xml");
		Baz baz = (Baz)context.getBean("baz");
		
		System.out.println(baz);
		

	}

}
