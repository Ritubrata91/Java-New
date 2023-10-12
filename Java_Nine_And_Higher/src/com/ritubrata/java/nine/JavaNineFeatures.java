package com.ritubrata.java.nine;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaNineFeatures {

	public static void ofMethodExampled() {
		final List<String> list = List.of("red", "green", "blue");
		System.out.println("After using List.of method : " +list);
		list.add("violet"); // throws UnsupportedOperationException

		final List<String> list_two = List.of("red", "green", null); // throws NullPointerException
		System.out.println(list_two);
	}

	public static void iterateExample(){
		Predicate<Integer> hasNext = n -> n < 100;
		Stream.iterate(1, hasNext, n -> n * 2)
				.forEach(System.out::println);
	}

	public static void takeWhileExample(){
		List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2, 6, 7, 8);

		List<Integer> result = numbers.stream()
				.takeWhile(n -> n % 2 == 1) // Take elements until the condition (n % 2 == 1) is false.
				.toList();

		System.out.println(result);   // Output: [1, 3, 5]
	}

	public static void dropWhileExample(){
		List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 6, 7, 8);

		List<Integer> result = numbers.stream()
				.dropWhile(n -> n % 2 == 1) // Skip elements until the condition (n % 2 == 1) is false.
				.toList();

		System.out.println(result); // Output: [2, 4, 6, 7, 8]
	}


	public static void main(final String[] args) {
		ofMethodExampled();
		iterateExample();
		takeWhileExample();
		dropWhileExample();
	}
}
