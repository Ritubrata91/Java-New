package com.ritubrata.string;

public class StaticVsLocalString {

	static String s = "Instance";
	public static void method(String s) {
		s+="Add";
	}

	public static void main(final String[] args) {
		final StaticVsLocalString a = new StaticVsLocalString();
		s= "New Instance";
		final String s = "Local";
		method(s);
		System.out.println(s);
		System.out.println(StaticVsLocalString.s); //System.out.println(a.s);
	}

}
