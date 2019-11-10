package testPjt001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk trans = (TransportationWalk)ctx.getBean("tWalk");
		
		trans.move();
		
		ctx.close();
	}

}
