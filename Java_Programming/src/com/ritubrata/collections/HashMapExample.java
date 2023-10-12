package com.ritubrata.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(final String[] args) {
		final Map<String, String> map = new HashMap<>();

		map.put("one", "value-1");
		map.put("two", "value-2");
		System.out.println(map.get(null));

		map.put("one", "value-1");
		map.put("eon", null);
		System.out.println(map.get("eon"));
		System.out.println(map.get("two"));
	}
}
