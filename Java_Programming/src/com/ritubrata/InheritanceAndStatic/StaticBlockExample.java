package com.ritubrata.InheritanceAndStatic;

class Hello{
	final static int x;
	static {
		x= 20;
		System.out.println("static block");
	}
}
public class StaticBlockExample {
	public static void main(final String[] args) {
		System.out.println(Hello.x);
	}

}
