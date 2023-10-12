package com.ritubrata.exceptions;

public class ClassWithoutExceptionThrowing {
	public static void main(final String[] args) {
		System.out.println(method());
	}

	private static int method() {
		int i =0;
		try {
			i = 100/0;
			return i;
		}catch(final Exception e) {
			i = 200/0; //ArtihmeticException is thrown
			return i;
		}finally {
			i =300;
			//return i; //will return 300 if it is not commented out.
		}
	}

}
