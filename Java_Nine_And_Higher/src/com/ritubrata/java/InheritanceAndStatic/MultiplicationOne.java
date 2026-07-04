package com.ritubrata.java.InheritanceAndStatic;

public interface MultiplicationOne {
	default void result() {
		final int x =7;
		final int y = 8;
		System.out.println("Result is : "+ x*y);
	}
}
