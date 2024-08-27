package com.ritubrata.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExampleOfIntegers {

	public static boolean isPrime(final int number) {
		return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
	}

	public static void askedInInterview(){
		final List<Integer> intList = Arrays.asList( 1,2,3,4,5 );
		System.out.println("Summation of square of odd numbers in list : " +
				intList.stream()
						.filter(n-> n%2 !=0)
						.collect(Collectors.summingInt(n->n*n)));

		final int number = 5;
		System.out.println("Factorial of " + number + " is : " +  IntStream.rangeClosed(2, number).reduce((x, y) -> x * y).getAsInt());

		System.out.println("2nd highest number in 1,3,5,4,2,5 is : " +
				Stream.of(1,3,5, 4,2,5).distinct()
						.collect(Collectors.toList()).stream()
						.sorted(Comparator.reverseOrder())
						.limit(2).skip(1)
						.findFirst().get());

		// find duplicate and print their count
		final List<Integer> list = List.of(4, 2, 5, 4, 3, 2, 5);
		Map<Integer ,Long > map = list.stream()
				.filter(i -> Collections.frequency(list, i) >1)
				.collect(Collectors.groupingBy(c ->c , Collectors.counting()));
		System.out.println("Duplicates and their count in : 4, 2, 5, 4, 3, 2, 5 is : ");
		map.forEach(   (k , v ) -> System.out.println( k + " : "+ v ));

		//find indices of two elements whose sum is a given number
		int[] array = {2,8,3,7,6,3};
		int k = 9;
		System.out.println("Indices are: ");
		IntStream.range(0, array.length)
				.boxed()
				.flatMap(i -> IntStream.range(i, array.length)
						.boxed()
						.filter(j -> k - array[i] == array[j])
						.flatMap(j -> Stream.of(new int[] { i, j })))
				.forEach(arr -> System.out.println(Arrays.toString(arr)));
	}
	public static void main(final String[] args) {
		//use of average
		Arrays.stream(new int[]{1, 2, 3, 4}).map(n -> n * n)
		.average().ifPresent(System.out::println);

		//use of mapToInt and max
		Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue)
		.max().ifPresent(System.out::println);

		//use of max
		System.out.println("use of max : " + Stream.of(1,5,2,3,4,7).max(Integer::compare).get());


		System.out.println( IntStream.range(1, 20)
				.filter(v -> v%4 ==0)
				.filter(v -> v <10)
				.max().getAsInt());

		System.out.println("25 is prime : " + isPrime(25));

		System.out.println("23 is prime : " + isPrime(23));


		final List<Integer> intList = Arrays.asList( 1,2,3,4,5 );
		final List<String> newStringList = intList.stream()
				.map(String::valueOf)
				.collect(Collectors.toList());
		System.out.println(" Convert List<Integer> to List<String> : " + newStringList);

		System.out.println(Arrays.asList(5,7,11,15).stream().filter(n->n*n >100).collect(Collectors.toList()));


		final int number = 5;
		System.out.println("Fibonacci series for first " + number + " elements is : ");
		Stream.iterate(new long[] { 0, 1 }, p -> new long[] { p[1], p[0] + p[1] })
		.limit(number)
		.forEach(p -> System.out.println(p[0]));
	}
}
