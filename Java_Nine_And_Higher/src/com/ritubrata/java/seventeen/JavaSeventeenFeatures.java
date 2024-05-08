package com.ritubrata.java.seventeen;

public class JavaSeventeenFeatures {

    public static void main(String[] args) {
        longTextExample();
    }

    public static void longTextExample() {
        String longText = """
            This is a text block in Java 17.
            It allows you to write multi-line strings
            without needing to escape newline characters.
            
            You can also preserve leading whitespace for formatting.
            \tIndented text is also preserved.
            """;

        System.out.println(longText);
    }


}


