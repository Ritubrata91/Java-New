package com.ritubrata.java.nine;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9StreamRelatedChanges {

	public static void ofMethodExampled() {
		System.out.println("******** List.of() method ***********");
		final List<String> list = List.of("red", "green", "blue");
		System.out.println("After using List.of method : " +list);
		//list.add("violet"); // throws UnsupportedOperationException

		//final List<String> list_two = List.of("red", "green", null); // throws NullPointerException
		System.out.println("*******************");
	}

	public static void iterateExample(){
		System.out.println("******** Stream.iterate() method ***********");
		Predicate<Integer> hasNext = n -> n < 100;
		Stream.iterate(1, hasNext, n -> n * 2)
				.forEach(System.out::println);
		System.out.println("*******************");
	}

	public static void takeWhileExample(){
		System.out.println("******** Stream.takeWhile() method ***********");
		List<Integer> numbers = Arrays.asList(1, 3, 5, 4, 2, 6, 7, 8);

		List<Integer> result = numbers.stream()
				.takeWhile(n -> n % 2 == 1) // Take elements until the condition (n % 2 == 1) is false.
				.collect(Collectors.toList());

		System.out.println(result);   // Output: [1, 3, 5]
		System.out.println("*******************");
	}

	public static void dropWhileExample(){
		System.out.println("******** Stream.dropWhile() method ***********");
		List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 6, 7, 8);

		List<Integer> result = numbers.stream()
				.dropWhile(n -> n % 2 == 1) // Skip elements until the condition (n % 2 == 1) is false.
				.collect(Collectors.toList());

		System.out.println(result); // Output: [2, 4, 6, 7, 8]
		System.out.println("*******************");
	}

	public static void streamOfNullableexample(){
		System.out.println("******** Stream.ofNullable() method ***********");
		List<String> list = Arrays.asList("a","b",null,"c","d",null,"e");
		List<String> stringList = list.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		System.out.println(stringList);
		System.out.println("*******************");
	}


	public static void main(final String[] args) {
		ofMethodExampled();
		iterateExample();
		takeWhileExample();
		dropWhileExample();
		streamOfNullableexample();
	}
}
