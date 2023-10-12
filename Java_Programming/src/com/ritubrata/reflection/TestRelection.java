package com.ritubrata.reflection;

public class TestRelection {
	private final String s;
	public TestRelection() { s = "GeeksforGeeks"; }
	public void method1(){
		System.out.println("The string is " + s);
	}
	public void method2(final int n){
		System.out.println("The number is " + n);
	}
	private void method3(){
		System.out.println("Private method invoked");
	}
}