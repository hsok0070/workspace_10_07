package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.GreetingServiceImpl;
import data.OutputServiceImplConsole;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/NewFile.xml");
		GreetingServiceImpl g = (GreetingServiceImpl)context.getBean("greeting");
		
		System.out.println(g);
		
	}

}