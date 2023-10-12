package com.ritubrata.exceptions;

public class ClassWithoutCatch {

	public static void main(final String[] args) {
		try	{
			System.out.println("A");
			final int num = 99/0;
			System.out.print("B");
		}
		finally{
			System.out.println("C");
		}
		System.out.println("D");
	}

}
