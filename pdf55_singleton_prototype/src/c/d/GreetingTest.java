package c.d;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class GreetingTest {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config/config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		GreetingService bean = (GreetingService)factory.getBean("greeting");
		GreetingService bean2 = (GreetingService)factory.getBean("greeting");
		
		System.out.println(bean==bean2);
		System.out.println(bean+"\n"+bean2);
	}

}
