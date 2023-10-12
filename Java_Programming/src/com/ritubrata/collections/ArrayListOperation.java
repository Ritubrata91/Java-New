package com.ritubrata.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation {
	public static void main(final String[] args) {
		final List<Integer> list = new ArrayList<>();
		for(int i =0; i < 100; i++) {
			list.add(0);
			list.add(0);
			list.add(1);
			list.add(null);
			list.add(-1);
		}
		System.out.println(list.size());
	}

}
