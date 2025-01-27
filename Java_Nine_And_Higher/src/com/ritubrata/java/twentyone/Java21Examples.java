package com.ritubrata.java.twentyone;

import java.util.ArrayList;
import java.util.List;

public class Java21Examples {

    public static void main(String[] args) {
        PatternMatchingForSwitch("abc");
        SequenceCollectionExample();
    }

    private static void PatternMatchingForSwitch(String response) {
        switch (response) {
            case "yes", "yeah" -> System.out.println("You said yes!");
            case "no", "nope" -> System.out.println("You said no!");
            default -> System.out.println("Please choose.");
        }
    }

    private static void SequenceCollectionExample(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);

        // Fetch the first element (element at index 0)
        int firstElement = list.getFirst();

        // Fetch the last element
        int lastElement = list.getLast();
        System.out.println(firstElement + lastElement);


    }
}
