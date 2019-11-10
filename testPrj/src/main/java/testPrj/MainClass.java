package testPrj;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		TranspotationWalk trans = new TranspotationWalk();
//		trans.move();

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TranspotationWalk trans = ctx.getBean("tWalk", TranspotationWalk.class);
		trans.move();
		
		ctx.close();
	}
}
