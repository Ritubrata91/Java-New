package com.ritubrata.GenericsAndVarargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ritubrata Chatterjee
 *
 */
public class GenericMethods {

	static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
	static Integer[] intArray = {1, 2, 3, 4, 5};
	static Boolean[] boolArray = {true, false, true};

	public static <T> List<T> arrayToList(final T[] array, final List<T> list) {
		Collections.addAll(list, array);
		System.out.println(list);
		return list;
	}

	public static void main(final String[] args) {
		arrayToList(charArray, new ArrayList<>());
		arrayToList(boolArray, new ArrayList<>());
		arrayToList(intArray, new ArrayList<>());
	}

}
