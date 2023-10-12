package com.ritubrata.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertArrayListToHashMap {
	public static void main(final String[] args) {
		final ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Pineapple");
		fruits.add("Apple");

		/*
		 * System.out.println(fruits.stream().collect(Collectors.toList()));
		 * System.out.println("Elements in ArrayList are : " + fruits);
		 */

		final HashMap<String, Integer> res = fruits.stream().collect(Collectors.toMap(
				Function.identity(), String::length,
				(e1, e2) -> e2, HashMap::new));

		System.out.println("Elements in HashMap are : "
				+ res);

	}
}
