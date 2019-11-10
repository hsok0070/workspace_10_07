package x.y;

public class Foo {
	private Bar bar;
	private Baz baz;
	
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}

	public void printbar() {
		System.out.print(bar.bar);
		bar.print();
	}

	public void printbaz() {
		System.out.print(baz.baz);
		baz.print();
	
	}
	
}
