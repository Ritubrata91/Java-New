package com.ritubrata.higher.version.java11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java11Features {
    private static final Logger LOGGER = LoggerFactory.getLogger(Java11Features.class);

    public static void main(final String[] args) {
        LOGGER.info("********* Predicate Not Method ***************");
        predicateNotMethod();
        LOGGER.info("************************");
		LOGGER.info("********* toArray method *****************");
		toArrayMethod();
        LOGGER.info("************************");

	}


    private static void predicateNotMethod() {
        final List<Integer> list = List.of(2, 3, 4, 56, 45, 76, 97);
        list.stream().filter(Predicate.not(n -> n % 2 == 0)).forEach(System.out::println);
    }

	private static void toArrayMethod(){
		List<String> sampleList = Arrays.asList("Java", "Kotlin");
		String[] sampleArray = sampleList.toArray(String[]::new);
		LOGGER.info(sampleArray[0] + "  "+ sampleArray[1]);
	}


}
