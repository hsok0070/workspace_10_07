package javac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "config/NewFile.xml" });
		Bar bar = (Bar) context.getBean("bar");
		bar.doBar();
		
		//((AbstractApplicationContext) context).close();
		((ClassPathXmlApplicationContext) context).close(); // ApplicationContext는 close가 정의되어 있지 않기 때문에, 캐스팅 후 close메소드를 이용하여 소멸 이후에 소멸메소드 호출

	}

}
