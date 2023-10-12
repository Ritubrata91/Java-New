package com.ritubrata.arrays;

import java.util.Arrays;

public class DifferentObjectTogetherInArray {
	public static void main(final String[] args) {
		final Object[] myObjects = {
				new Integer(12),
				new String("Foo"),
				new Integer(5),
				new Boolean(true)
		};
		Arrays.sort(myObjects); //ClassCastException
		for(int i =0; i<myObjects.length;i++) {
			System.out.println(myObjects[i]);
		}
	}

}
