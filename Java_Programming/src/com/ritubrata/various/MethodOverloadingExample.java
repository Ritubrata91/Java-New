package com.ritubrata.various;

public class MethodOverloadingExample {

	public static void main(final String[] args) {
		display(null);
	}

	private static void display(final Object object) {
		System.out.println("Object");
	}

	private static void display(final String string) {
		System.out.println("String");
	}

	private static void display(final StringBuffer sb) {
		System.out.println("StringBuffer");
	}
}
