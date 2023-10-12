package com.ritubrata.java8;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionExample {

	/**
	 * @param args the command line arguments
	 */
	public static void main(final String[] args) {

		final IntFunction<String> intToString = num -> Integer.toString(num);
		System.out.println("expected value 3, actual value: " +
				intToString.apply(123).length());

		//static method reference using ::
		final IntFunction<String> intToString2 = Integer::toString;
		System.out.println("expected value 4, actual value:  " +
				intToString2.apply(4567).length());

		//lambdas made using a constructor
		final Function<String,BigInteger> newBigInt = BigInteger::new;
		System.out.println("expected value: 123456789, actual value: "+
				newBigInt.apply("123456789"));

		//Function example
		final Function<Integer,String> converter = num -> Integer.toString(num);
		System.out.println("length of 26: " + converter.apply(26).length());

		final BiFunction<String, String, String> concat = (a, b) -> a + b;
		final String sentence = concat.apply("Today is ", "a great day");
		System.out.println(sentence);
	}

}
