package look_up;

public class Foo {
	private Bar bar;
	
	public void setBar(Bar bar){
	this.bar = bar;
	}
	
	public void doBar(){
	Bar bar=getBar();
	bar.doit();
	}
	
	protected Bar getBar(){
	return null;
	}
	

}
