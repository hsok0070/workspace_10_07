package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.Employee;
import x.y.Person;



public class ParsonSpring {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config/appcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee)factory.getBean("e");
		Person person = (Person)factory.getBean("p");
		
		emp.print();
		person.na
	}

}
