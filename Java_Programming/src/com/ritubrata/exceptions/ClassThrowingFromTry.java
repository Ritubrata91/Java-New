package com.ritubrata.exceptions;

public class ClassThrowingFromTry extends Exception{
	private static final long serialVersionUID = 1L;

	public static void main(final String args[]) {
		try {
			throw new ClassThrowingFromTry();
		}
		catch(final ClassThrowingFromTry t) {
			System.out.println("Got the Test Exception");
		}
		finally {
			System.out.println("Inside finally block ");
		}
	}
}
