package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.list;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/NewFile.xml");
		list list1 = (list)context.getBean("list");
		
		System.out.println(list1.toString());
	}

}
