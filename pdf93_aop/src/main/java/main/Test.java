package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.GreetingService;
import data.MethodBeforeLogAdvice;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/pojo.xml");
		GreetingService g = (GreetingService)context.getBean("greeting");
		g.sayHello("홍길동");
		g.sayGoodbye("이길동");
		
	}

}
