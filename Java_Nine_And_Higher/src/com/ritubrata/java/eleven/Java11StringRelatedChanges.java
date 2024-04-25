package com.ritubrata.java.eleven;

public class Java11StringRelatedChanges {

    public static void main(String[] args) {
        /*exampleOfStringLinesAndStrip();
        exampleOfStringIsBlank();*/
        exampleOfRepeatAndReplaceRelatedMethods();
    }
    public static void exampleOfStringLinesAndStrip() {
        System.out.println("**************** String.lines() & String.strip()**********");
        String originalString = "Hello\nWorld\n123";
        //originalString.replaceAll("\\n", "\\\\n").lines().forEach(System.out::println);
        originalString.lines().forEach(System.out::println);

        String originalString2 = "  ritu.me  23333  ";
        System.out.println("'" + originalString2.strip() + "'");
        System.out.println("'" + originalString2.stripLeading() + "'");
        System.out.println("'" + originalString2.stripTrailing() + "'");
        System.out.println("**************************");
    }
    public static void exampleOfStringIsBlank() {
        System.out.println("**************** String.isBlank() **********");
        String emptyString = "";
        System.out.println("Empty String is blank    -> " + emptyString.isBlank());

        String onlyLineSeparator = System.getProperty("line.separator");
        System.out.println("Line Separator is Blank     -> " + onlyLineSeparator.isBlank());

        String tabOnly = "\t";
        System.out.println("Tab is Blank -> " + tabOnly.isBlank());

        String spacesOnly = "   ";
        System.out.println("Spaces is blank  -> " + spacesOnly.isBlank());
        System.out.println("******************************");
    }

    public static void exampleOfRepeatAndReplaceRelatedMethods(){
        System.out.println("**************** String.replace() **********");
        String str = "Guru99 is a site providing free tutorials";
        String str1 = str.replaceFirst("s", "9");
        System.out.println(str1);

        String str2 = str.replace("Guru", "Ritu");
        System.out.println(str2);

        String str3 = str.replaceAll("\\s", "");
        System.out.println(str3);

        String s = "abc";
        String repeated = s.repeat(3);
        System.out.println(repeated);
        System.out.println("******************************");
    }

}
