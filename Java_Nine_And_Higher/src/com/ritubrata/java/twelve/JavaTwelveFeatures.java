
package com.ritubrata.java.twelve;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class JavaTwelveFeatures {

    public static void fileMismatchExample() throws IOException {
        Path path1 = Files.createTempFile("file1", ".txt");
        Path path2 = Files.createTempFile("file2", ".txt");
        Files.writeString(path1, "Geeks for geeks");
        Files.writeString(path2, "Geeks for geeks");

        long mismatch1 = Files.mismatch(path1, path2);

        System.out.println(
                "File Mismatch position or -1 is returned if there is no mismatch");

        System.out.println(
                "Mismatch position in file1 and file2 is : "
                        + mismatch1);

        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();

        System.out.println();

        Path path3 = Files.createTempFile("file3", ".txt");
        Path path4 = Files.createTempFile("file4", ".txt");
        Files.writeString(path3, "Geeks for geeks");
        Files.writeString(path4, "Geeks for the geeks");

        long mismatch2 = Files.mismatch(path3, path4);

        System.out.println(
                "Mismatch position in file3 and file4 is : "
                        + mismatch2);

        path3.toFile().deleteOnExit();
        path4.toFile().deleteOnExit();
    }

    public static void stringTransformAndIndent(){
        String str = "Welcome to Tutorialspoint!";
        System.out.println(str.indent(0));
        System.out.println(str.indent(5));

        String text = "Java";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);

        Optional<String> optional = text.describeConstable();
        System.out.println(optional);

        String cDescription = text.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(cDescription);
    }

	public static void main(final String[] args) throws IOException {
        fileMismatchExample();
        stringTransformAndIndent();
	}

}

