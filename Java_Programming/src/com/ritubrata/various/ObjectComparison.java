package com.ritubrata.various;

public class ObjectComparison {
	int id;

	public ObjectComparison(final int id) {
		this.id = id;
	}

	public static void main(final String[] args) {
		final ObjectComparison oc_one = new ObjectComparison(1);
		final ObjectComparison oc_two = new ObjectComparison(1);
		System.out.println(oc_one == oc_two);
		System.out.println(oc_one.equals(oc_two));
	}
}
