package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.GreetingServiceImpl;

public class main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/test.xml");
		GreetingServiceImpl g = (GreetingServiceImpl)context.getBean("greeting");
		g.sayHello("홍길동");
		g.sayGoodbye("박길동");
	}

}
