package data;

public class GreetingServiceImpl {

	private OutputService outputter;

	public void setOutputter(OutputService outputter) {
		this.outputter = outputter;
	}

	@Override
	public String toString() {
		return outputter.print();
	}

	

}
