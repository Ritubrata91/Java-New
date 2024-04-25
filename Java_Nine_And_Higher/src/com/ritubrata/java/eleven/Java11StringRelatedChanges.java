package com.ritubrata.java.eleven;

import java.util.stream.Collectors;

public class Java11StringRelatedChanges {

    /**
     * Write provided {@code String} in header. Note that this
     * implementation uses {@code String.repeat(int)}.
     *
     * @param headerText Title of header.
     */
    private static void writeHeader(final String headerText) {
        final String headerSeparator = "=".repeat(headerText.length() + 4);

        System.out.println("\n" + headerSeparator);
        System.out.println(headerText);
        System.out.println(headerSeparator);
    }


    /**
     * Demonstrate method {@code String.lines()} added with JDK 11.
     */
    public static void demonstrateStringLines() {
        String originalString = "Hello\nWorld\n123";

        String stringWithoutLineSeparators = originalString.replaceAll("\\n", "\\\\n");

        writeHeader("String.lines() on '" + stringWithoutLineSeparators + "'");

        originalString.lines().forEach(System.out::println);
    }

    /**
     * Demonstrate method {@code String.strip()} added with JDK 11.
     */
    public static void demonstrateStringStrip() {
        String originalString = "  ritu.me  23333  ";

        writeHeader("String.strip() on '" + originalString + "'");
        System.out.println("'" + originalString.strip() + "'");
    }

    /**
     * Demonstrate method {@code String.stripLeading()} added with JDK 11.
     */
    public static void demonstrateStringStripLeading() {
        String originalString = "  ritu.me  23333  ";

        writeHeader("String.stripLeading() on '" + originalString + "'");
        System.out.println("'" + originalString.stripLeading() + "'");
    }

    /**
     * Demonstrate method {@code String.stripTrailing()} added with JDK 11.
     */
    public static void demonstrateStringStripTrailing() {
        String originalString = "  ritu.me  23333  ";

        writeHeader("String.stripTrailing() on '" + originalString + "'");
        System.out.println("'" + originalString.stripTrailing() + "'");
    }

    /**
     * Demonstrate method {@code String.isBlank()} added with JDK 11.
     */
    public static void demonstrateStringIsBlank() {
        writeHeader("String.isBlank()");

        String emptyString = "";
        System.out.println("Empty String is blank    -> " + emptyString.isBlank());

        String onlyLineSeparator = System.getProperty("line.separator");
        System.out.println("Line Separator is Blank     -> " + onlyLineSeparator.isBlank());

        String tabOnly = "\t";
        System.out.println("Tab is Blank -> " + tabOnly.isBlank());

        String spacesOnly = "   ";
        System.out.println("Spaces is blank  -> " + spacesOnly.isBlank());
    }


    public static void lines() {
        writeHeader("String.lines()");

        String str = "Hello \n World, I,m\nritu.";

        System.out.println(str.lines().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
       writeHeader("User-Agent\tMozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5)");
        demonstrateStringLines();
        demonstrateStringStrip();
        demonstrateStringStripLeading();
        demonstrateStringStripTrailing();
        demonstrateStringIsBlank();
        lines();
    }

}
