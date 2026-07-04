package com.ritubrata.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsageOfFlatMap {
	public static void main(final String[] args){
		final List<String> list = Arrays.asList("Geeks", "GFG",
				"GeeksforGeeks", "gfg");
		list.stream().flatMap(str ->
		Stream.of(str.charAt(2))).
		forEach(System.out::println);

		System.out.println(Arrays.asList(Arrays.asList(1,2), Arrays.asList(5,6))
				.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList()));

		final int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;

		Stream.of(arr).flatMapToInt(IntStream::of).forEach(System.out::println);

	}
}
