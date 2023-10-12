
package com.ritubrata.GenericsAndVarargs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ritubrata Chatterjee
 *
 */
public class GenericsExample {

	public static void main(final String[] args) {
		withoutGenerics();
		withGenerics();
	}

	private static void withoutGenerics() {
		// Example without Generics
		final List names = new ArrayList();
		names.add("Kelly");
		final String name = (String) names.get(0);
		System.out.println("First name: " + name);
		names.add(7);
		System.out.println(names);
	}

	private static void withGenerics() {
		// Example with Generics
		final List<String> names2 = new ArrayList();
		names2.add("Kelly");
		final String name2 = names2.get(0);
		System.out.println("First name: " + name2);
		names2.add(7);
	}

}
