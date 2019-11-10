package com.youtube.test;

public class Calculation {
	private int a,b;
	
	public Calculation() {};
	
	public Calculation(int a, int b) {
		this.a = a;
		this.a = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void add() {
		System.out.println("add()");
		System.out.println(this.a + this.b);
		
	}
	
	public void sub() {
		System.out.println("sub()");
		System.out.println(this.a - this.b);
	}
	
	public void mult() {
		System.out.println("mult()");
		System.out.println(this.a * this.b);
	}
	
	public void div() {
		System.out.println("div()");
		System.out.println(this.a / this.b);
	}
	
	

}
