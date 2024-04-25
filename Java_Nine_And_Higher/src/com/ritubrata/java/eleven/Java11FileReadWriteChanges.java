package com.ritubrata.java.eleven;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11FileReadWriteChanges {

    public static void main(String[] args) throws Exception {
        final Path path = Paths.get("./resources/sample.txt");
        final String fileContent = Files.readString(path);
        System.out.println(fileContent);

        final Path new_path = Paths.get("./resources/sample_two.txt");
        Files.writeString(new_path, "jkl", StandardOpenOption.APPEND);

        Files.delete(path);
    }

}