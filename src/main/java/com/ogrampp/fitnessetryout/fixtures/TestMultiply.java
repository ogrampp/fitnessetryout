package com.ogrampp.fitnessetryout.fixtures;

public class TestMultiply {
	private int a = 0;
	private int b = 0;
	
	public TestMultiply(){
		
	}
	
	public void setA(int a){
		this.a = a;
	}
	
	public void setB(int b){
		this.b = b;
	}
	
	public int multiply(){
		return this.a * this.b;
	}
}
