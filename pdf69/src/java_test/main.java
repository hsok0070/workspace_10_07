package java_test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config/test.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		for(int i=0; i<100; i++) {
			Foo foo = (Foo)factory.getBean("foo");
		}
		

	}

}
