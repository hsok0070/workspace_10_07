package data;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
	
	@Override
	public void setGreeting(String hello) {
		System.out.println(hello+"setGreeting");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name+"sayHello");
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println(name+"sayGoodbye");
	}

}
