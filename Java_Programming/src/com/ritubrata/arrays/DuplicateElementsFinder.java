package com.ritubrata.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsFinder {
	public static void main(final String[] args){
		final String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		System.out.println(byStream(strArray));
		byHashSet(strArray);
	}

	private static Set<String> byStream(final String[] strArray) {
		final HashSet<String> set = new HashSet<String>();
		return Arrays.stream(strArray)
				.filter(s->!set.add(s))
				.collect(Collectors.toSet());
	}

	private static void byHashSet(final String[] strArray) {
		final HashSet<String> set = new HashSet<String>();
		for (final String arrayElement : strArray){
			if(!set.add(arrayElement)){
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}

}
