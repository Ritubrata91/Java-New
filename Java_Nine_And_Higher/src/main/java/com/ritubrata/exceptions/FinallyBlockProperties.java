package com.ritubrata.exceptions;

public class FinallyBlockProperties {

	public static void main(final String[] args) {
		printFromCatchAndFinally();
		System.out.println("********************************");
		System.out.println(returnFromCatchAndFinally());
	}

	private static void printFromCatchAndFinally() {
		int i ;
		try {
			i =2/0;
		}catch (final ArithmeticException e) {
			i =3;
			System.out.println(i);
		}finally {
			i =4;
			System.out.println(i);
		}
	}

	private static int returnFromCatchAndFinally() {
		int i ;
		try {
			i =2/0;
		}catch (final ArithmeticException e) {
			i =3;
			return i;
		}finally {
			i =4;
			return i;
		}
		//return i; //if no return statement in finally but in catch then this line will return 3.
		//if neither return statement in catch nor in finally then this line will return 4.

	}

}
