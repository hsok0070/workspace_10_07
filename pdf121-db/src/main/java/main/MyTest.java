package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.MyComponent;

public class MyTest {

	public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("config/mybatis.xml");
			//context.getBean("dataSource");
//			MyComponent m = (MyComponent)context.getBean("myComponent");
//			m.selectEmpResult(7902);
			
			((MyComponent)context.getBean("mycomponent")).selectEmpResult(7902);
	}

}
