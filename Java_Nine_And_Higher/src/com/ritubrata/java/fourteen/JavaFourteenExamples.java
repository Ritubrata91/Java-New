package com.ritubrata.java.fourteen;

public class JavaFourteenExamples {

	public static String switchExpression(final int day) {
		final String dayOfWeek = switch (day) {
		case 1->  {
			System.out.println("some logic");
			yield "Sunday";
		}
		case 2-> {
			System.out.println("some logic");
			yield  "Monday";
		}
		case 3->  {
			System.out.println("some logic");
			yield "Tuesday";
		}

		default-> throw new IllegalArgumentException("Unexpected value-> " + day);
		};
		return dayOfWeek;

	}

	public static void main(final String[] args) {
		System.out.println(switchExpression(3));
	}

}
