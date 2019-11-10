package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import look_up.Foo;

public class FooMain {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config/Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo foo = (Foo)factory.getBean("foo");
		
		foo.doBar();
		
	}

}
