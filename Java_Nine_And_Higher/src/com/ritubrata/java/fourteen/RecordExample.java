package com.ritubrata.java.fourteen;

/**
 * 1. Records cannot extend any other class, and cannot declare instance fields other than the private final fields
 * 2. Records are implicitly final, and cannot be abstract.
 * 3. The components of a record are implicitly final.
 */
public class RecordExample {

    public record Person (String name, int id) {}

    public static void main(String args[]) {

        // Creating object with default constructor
        Person e1 = new Person("abc",1001);

        // Auto generated getter methods
        System.out.println(e1.name() + " " + e1.id());

        // Auto-generated toString() method
        System.out.println(e1.toString());
    }
}
