package com.ritubrata.string;

public class CountCharacterOccurence {
	public static void main(final String[] args){
		final String s = "Java is java again java again";
		countOccuranceOfChar(s,'a');
	}

	private static void countOccuranceOfChar(final String str, final char c) {
		final int count = str.length() - str.replace(Character.toString(c), "").length();
		System.out.println("Number of occurances of " +c+ " in the string -> "+str+" is "+count);
	}


}
