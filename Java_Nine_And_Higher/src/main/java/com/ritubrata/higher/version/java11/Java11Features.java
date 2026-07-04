package com.ritubrata.higher.version.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java11Features {

    public static void main(final String[] args) {
        System.out.println("********* Predicate Not Method ***************");
        predicateNotMethod();
        System.out.println("************************");
		System.out.println("********* toArray method *****************");
		toArrayMethod();
        System.out.println("************************");

	}


    private static void predicateNotMethod() {
        final List<Integer> list = List.of(2, 3, 4, 56, 45, 76, 97);
        list.stream().filter(Predicate.not(n -> n % 2 == 0)).forEach(System.out::println);
    }

	private static void toArrayMethod(){
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		System.out.println(sampleArray[0] + "  "+ sampleArray[1]);
	}


}
