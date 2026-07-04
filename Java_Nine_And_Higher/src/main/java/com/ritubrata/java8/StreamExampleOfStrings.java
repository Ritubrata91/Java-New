package com.ritubrata.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleOfStrings {


	public static void main(final String[] args) {
		//use of sorted
		Arrays.asList("red", "green", "blue").stream().sorted()
		.findFirst().ifPresent(System.out::println);

		//example of Stream.of with a filter
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
		.filter(fruit -> fruit.startsWith("a")).forEach(fruit -> System.out.println("Starts with a: " + fruit));

		System.out.println("use of limit : " +Stream.generate(()-> "DBOI").limit(10).collect(Collectors.toList()));

		final List<String> stringList = Arrays.asList( "-1" , "2", "3", "4", "5" );
		final List<Integer> newIntList = stringList.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println(" Convert List<String> to List<Integer> : " + newIntList);


		System.out.println("Largest string between red , green and blue is : " +
				Collections.max(Arrays.asList("red", "green", "blue"),
						Comparator.comparing(String::length)));
	}

}
