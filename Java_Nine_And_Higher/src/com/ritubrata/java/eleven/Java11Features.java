package com.ritubrata.java.eleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java11Features {

    public static void main(final String[] args) {
        //fileReadWrite();
        System.out.println("********* Predicate Not Method ***************");
        predicateNotMethod();
        System.out.println("************************");
        System.out.println("********** String Related Changes ********************");
        stringRelatedChanges();
        System.out.println("************************");
		System.out.println("********* toArray method *****************");
		toArrayMethod();
        System.out.println("************************");

	}

    private static void fileReadWrite() throws IOException {
        final Path path = Paths.get("./resources/sample.txt");
        final String fileContent = Files.readString(path);
        System.out.println(fileContent);

        final Path new_path = Paths.get("./resources/sample_two.txt");
        Files.writeString(new_path, fileContent.concat("jkl"));
        Files.delete(path);
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

    private static void stringRelatedChanges() {
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        //final String s = null;
        //System.out.println(s.isBlank()); //NullPointer

        System.out.println(" ri tu ".strip()); //both side spaces will be removed, middle spaces remain
        System.out.println(" ri tu ".stripLeading()); // left side space will be removed, middle spaces remain
        System.out.println(" ri tu ".stripTrailing()); // right side space will be removed, middle spaces remain

        "abc\ndef\nghi".lines().forEach(System.out::println);
    }
}
