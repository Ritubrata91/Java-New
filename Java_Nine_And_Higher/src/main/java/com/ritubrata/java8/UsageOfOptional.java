package com.ritubrata.java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class UsageOfOptional {
	public static void main(final String args[]) {
		usageOfofNullableAndOfForNullObject();
		usageOfisPresentgetorelseForNullObjects();
		final Optional<String> s = Optional.of("abc");
		System.out.println(s.map(UsageOfOptional::getOutput));
		System.out.println(s.flatMap(UsageOfOptional::getOutputOpt));
	}

	private static void usageOfofNullableAndOfForNullObject() {
		try {
			final Integer value1 = null;

			//Optional.ofNullable - allows passed parameter to be null.
			final Optional<Integer> a = Optional.ofNullable(value1);
			System.out.println("Optional.ofNullable for null prints " + a);

			//Optional.of - throws NullPointerException if passed parameter is null
			Optional.of(value1);
		}catch (final NullPointerException npe) {
			System.out.println("Optional.of() throws NullPointerException if passed param is Null.");
		}
	}

	private static void usageOfisPresentgetorelseForNullObjects() {
		try {
			final Integer value1 = null;
			final Optional<Integer> a = Optional.ofNullable(value1);

			//Optional.isPresent - checks the value is present or not
			System.out.println("First parameter is present: " + a.isPresent());

			//Optional.orElse - returns the value if present otherwise returns the default value passed.
			final Integer finalValue = a.orElse(new Integer(0));
			System.out.println("Fianl Value for orElse is : " + finalValue);

			System.out.println(".get() for Null returns : " + a.get());


		}catch (final NoSuchElementException e) {
			System.out.println("Optional.ofNullable().get() throws NoSuchElementException if passed param is Null.");
		}
	}

	static String getOutput(final String input) {
		return input == null ? null : "output for " + input;
	}

	static Optional<String> getOutputOpt(final String input) {
		return input == null ? Optional.empty() : Optional.of("output for " + input);
	}
}
