package com.youtube.test;

public class MainTest {
	public static void main(String[] args) {
		
		Calculation c = new Calculation();
		
		c.setA(10);
		c.setB(20);
		c.add();
		System.out.println(c.getA());
		
	}

}
