package com.ritubrata.java11.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;



public class Java9CollectionExample {

    public static void main(String[] args) {

        // Object
        List immutableList = List.of();

        // List<String>
        var foo = List.of("ritu", "github", "chatterjee");

        //  Map，Key Value Object
        Map emptyImmutableMap = Map.of();

        //  Map
        var mmp = Map.of(2017, "2016", 2018, "2019");

        //  Entries  Map
        Map<Integer, String> emptyEntryMap = Map.ofEntries(
                entry(20, "abc"),
                entry(30, "def"),
                entry(40, "ghi")
        );

        //  Map.Entry
        Map.Entry<String, String> immutableMapEntry = Map.entry("ritu", "emmmm");
        Map.ofEntries(immutableMapEntry);

        //  Set<String>
        Set<String> immutableSet = Set.of();

        //  Set<String>
        Set<String> bar = Set.of("a", "b", "c", "d", "e");

    }

}
