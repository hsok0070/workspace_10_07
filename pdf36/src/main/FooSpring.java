package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.Bar;
import x.y.Baz;
import x.y.Foo;

public class FooSpring {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config/appcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo foo = (Foo)factory.getBean("foo");
		
		foo.printbaz();
		foo.printbar();
		
	}

}
