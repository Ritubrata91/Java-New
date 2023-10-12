package com.ritubrata.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProgramsUsingJava8 {

	private static Map<String, Long> countOccuranceofEachChar(final String str) {
		return Arrays.stream(str.split("")).
				map(String::toLowerCase).
				collect(Collectors.groupingBy(s -> s,
						LinkedHashMap::new, Collectors.counting()));
	}

	private static long countOccuranceOfOneChar(final String str, final char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}

	private static Map<String, Long> countOccOfEachWords(final String str) {
		return Arrays.asList(str.split("\\W+")).
				stream().
				map(String::toLowerCase).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	private static void firstRepeatingAndNonRepeatingChar(final String str) {
		final Map<Character, Long> collect =  str.chars().
				mapToObj(i -> (char)i).
				collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap::new, Collectors.counting()));

		final Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( e -> e.getValue() == 1).map(Entry::getKey).findFirst();
		if(firstNonRepeat.isPresent()) {
			System.out.println("First non repeating:" + firstNonRepeat.get());
		}
		final Optional<Character> firstRepeat = collect.entrySet().stream().filter( e -> e.getValue() > 1).map(Entry::getKey).findFirst();
		System.out.println("First repeating:" + firstRepeat.orElse(null));
	}

	public static void main(final String[] args) {
		System.out.println("Occurance of Each Letter in String : " + countOccuranceofEachChar("ritubrata"));
		System.out.println("Number of occurances of a in ritubrata is : "+ countOccuranceOfOneChar("ritubrata",'a'));
		System.out.println("Occurance of Each words in String : " + countOccOfEachWords("aa is a boy and bb is a girl"));
		firstRepeatingAndNonRepeatingChar("ritubrata");

	}

}
