package com.ritubrata.exceptions;

import java.io.IOException;

public class ExceptionThrowingDuringInheritance {

	class A	{
		void m1() throws IOException{
			System.out.println("In m1 A");
		}
	}
	class B extends A{
		@Override
		void m1() throws Exception{
			System.out.println("In m1 B");
		}
	}

	public static void main(final String[] args) {
		final A a= new B();
		try {
			a.m1();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}


}
