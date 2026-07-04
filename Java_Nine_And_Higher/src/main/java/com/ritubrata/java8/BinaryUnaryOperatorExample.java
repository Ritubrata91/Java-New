package com.ritubrata.java8;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryUnaryOperatorExample {


	public static void main(final String[] args) {
		//Binary Operator example
		final BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10 + 25: " + add.apply(10, 25));

		//Unary Operator example
		final UnaryOperator<String> str  = String::toUpperCase;
		System.out.println(str.apply("This is my message in upper case"));

		//these two are the same using the static method concat
		final UnaryOperator<String> greeting = "Hello, "::concat;
		System.out.println(greeting.apply("World"));

		final UnaryOperator<String> makeGreeting = "Hello, "::concat;
		System.out.println(makeGreeting.apply("Peggy"));
	}

}
