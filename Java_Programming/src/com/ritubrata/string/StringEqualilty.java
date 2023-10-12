package com.ritubrata.string;

public class StringEqualilty {

	public static void main(final String[] args) {
		final String s1 = "Qualys";
		final String s2 = new String("Qualys");
		final String s3 = "Qualys";
		final String s4 = new String("Qualys");
		usingDoubleEquals(s1, s2, s3, s4);
		usingEqualsMethod(s1, s2, s3, s4);
	}

	private static void usingEqualsMethod(final String s1, final String s2, final String s3, final String s4) {
		System.out.println("Using .equals() for comparison : ");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
	}

	private static void usingDoubleEquals(final String s1, final String s2, final String s3, final String s4) {
		System.out.println("Using == for comparison : ");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);
	}

}
