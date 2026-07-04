package com.ritubrata.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        final List<Integer> intList = Arrays.asList( 1,2,3,4,5 );
        System.out.println("Summation of square of odd numbers in list : " +
                intList.stream()
                        .filter(n-> n%2 !=0)
                        .collect(Collectors.summingInt(n->n*n)));

        final int number = 5;
        System.out.println("Factorial of " + number + " is : " +  IntStream.rangeClosed(2, number).reduce((x, y) -> x * y).getAsInt());

        System.out.println("2nd highest number in 1,3,5,4,2,5 is : " +
                Stream.of(1,3,5, 4,2,5)
                        .sorted(Comparator.reverseOrder())
                        .distinct()
                        .limit(2).skip(1)
                        .findFirst().get());

        // find duplicate and print their count
        final List<Integer> list = List.of(4, 2, 5, 4, 3, 2, 5);
        System.out.println("Duplicates and their count in : 4, 2, 5, 4, 3, 2, 5 is : ");
        list.stream()
                .filter(i -> Collections.frequency(list, i) >1)
                .collect(Collectors.groupingBy(c ->c , Collectors.counting()))
                .forEach(   (k , v ) -> System.out.println( k + " : "+ v ));

        final int num =25;
        System.out.println(num + " is prime : " + IntStream.rangeClosed(2,num/2).noneMatch(i -> num%i==0));

        //print count of characters in a word
        final String word = "mississippi";
        word.chars().mapToObj(e -> (char) e).collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .forEach((k,v)->System.out.println( k + " : "+ v ));

        System.out.println( "************************************");

        //print count of characters in a sentence
        final String sentence = "mississippi is imp";
        Arrays.stream(sentence.split(" ")).collect(Collectors.toList())
                .stream()
                .flatMap(w -> w.chars().mapToObj(e -> (char) e).collect(Collectors.toList()).stream())
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .forEach((k,v)->System.out.println( k + " : "+ v ));

        System.out.println( "************************************");
        printAllPermutationOfString("abc","");


    }
    static void printAllPermutationOfString(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding the ith character
            String r = str.substring(0, i) + str.substring(i + 1);
            // Recurvise call
            printAllPermutationOfString(r, ans + ch);
        }
    }

}
