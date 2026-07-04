package com.ritubrata.higher.version.java8;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryUnaryOperatorExample {
	private static final Logger LOGGER = LoggerFactory.getLogger(BinaryUnaryOperatorExample.class);

	static void main(final String[] args) {

		//Binary Operator example
		final BinaryOperator<Integer> add = (a, b) -> a + b;
		LOGGER.info("add 10 + 25: " + add.apply(10, 25));

		//Unary Operator example
		final UnaryOperator<String> str  = String::toUpperCase;
		LOGGER.info(str.apply("This is my message in upper case"));

		//these two are the same using the static method concat
		final UnaryOperator<String> greeting = "Hello, "::concat;
		LOGGER.info(greeting.apply("World"));

		final UnaryOperator<String> makeGreeting = "Hello, "::concat;
		LOGGER.info(makeGreeting.apply("Peggy"));
	}

}
