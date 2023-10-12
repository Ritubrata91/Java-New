package com.ritubrata.java.ten;

import java.util.Arrays;
import java.util.List;

public class JavaTenFeatures {

	public static void copyOfMethod() {
		final List<String> list = List.copyOf(Arrays.asList("red", "green", "blue"));
		System.out.println("After using List.copyOf method : "+list);
		//list.add("violet");// throws UnsupportedOperationException

		final List<String> list_two = List.copyOf(Arrays.asList("red", "green", null)); // throws NullPointerException
		System.out.println(list_two);
	}

	public static void typeInferences() {
		final var numbers = List.of(1,2,3,4,5,6); // determines var type at compile time. var is not a keyword. null can not assigned to var.
		numbers.stream().forEach(System.out::println);
	}


	public static void main(final String[] args) {
		typeInferences();
		System.out.println("***************************************************************");
		copyOfMethod();
	}
}
