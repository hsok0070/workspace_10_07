package c.d;

public class GreetingServiceImpl implements GreetingService {

	@Override
	public void setGreeting(String Hello) {
		System.out.println(Hello+"Impl입니다.");
	}

	

}
