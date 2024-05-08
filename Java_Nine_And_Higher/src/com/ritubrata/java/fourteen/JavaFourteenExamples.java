package com.ritubrata.java.fourteen;

public class JavaFourteenExamples {

    public static String getDayOfWeek(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day of week: " + dayOfWeek);
        };
    }

	public static void main(final String[] args) {
		System.out.println(getDayOfWeek(3));
	}

}

