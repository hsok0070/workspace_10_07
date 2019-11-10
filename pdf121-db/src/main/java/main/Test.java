package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.User;
import data.UserDAOImpl2;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/test.xml");
		UserDAOImpl2 u = (UserDAOImpl2)context.getBean("userDao");
		
		System.out.println(u.findUserList());
		
		
	}

}
