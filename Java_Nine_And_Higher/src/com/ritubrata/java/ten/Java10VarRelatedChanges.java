package com.ritubrata.java11.var;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Java10VarRelatedChanges {

    public static void main(String[] args) throws Exception {
        var list   = new ArrayList<String>();   //ArrayList<String>
        var stream = list.stream();             //Stream<String>

        var newList = List.of("hello", "ritu");
        newList.forEach(System.out::println);

        String fileName = "./pom.xml";

        var path  = Paths.get(fileName);
        var bytes = Files.readAllBytes(path);

        System.out.println("bytes which are read: " + bytes);

        for (var b : bytes) {
            // TODO
        }

        try (var foo = new FileInputStream(new File(""))) {
            System.out.println(foo);
        } catch (Exception e) {
            // ignore
        }

    }
}
