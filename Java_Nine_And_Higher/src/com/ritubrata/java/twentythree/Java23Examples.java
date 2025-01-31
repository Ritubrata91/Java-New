package com.ritubrata.java.twentythree;

import java.util.List;
import java.util.stream.Gatherers;

public class Java23Examples {

    public static void main(String[] args) {
        primitiveMatchingExample("45");
        streamGatherExample();
    }

    private static void primitiveMatchingExample(Object value){
        switch (value) {
            case Integer i when i > 100 -> System.out.println("Large integer: " + i);
            case int i -> System.out.println("Small integer: " + i);
            case Double d when d > 0 -> System.out.println("Positive double: " + d);
            case double d -> System.out.println("Non-positive double: " + d);
            case Long l -> System.out.println("Long value: " + l);
            case Boolean b -> System.out.println("Boolean value: " + b);
            default -> System.out.println("Unsupported type");
        }
    }

    private static void streamGatherExample(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12);

        List<List<Integer>> pairedEvenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .gather(Gatherers.windowFixed(3))
                .toList();

        System.out.println(pairedEvenSquares);
    }
}
