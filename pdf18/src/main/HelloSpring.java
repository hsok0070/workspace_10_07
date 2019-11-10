package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.HelloBean;

public class HelloSpring {

	public static void main(String[] args) {

		Resource resource =new ClassPathResource("config/AppContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		HelloBean bean= (HelloBean)factory.getBean("h");
		bean.sayHello("Spring");
		
	}

}
