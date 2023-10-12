package com.ritubrata.collections;

import java.util.HashMap;
import java.util.Map;

import lombok.Value;

public class HashMapUsingObjectAsKey {

	@Value
	public static class KeyObject {
		int id;
		String name;
		public KeyObject(final int id, final String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return (int) Math.random();
		}
		@Override
		public boolean equals(final Object obj) {
			return true;
		}
	}

	public static void main(final String[] args) {
		final KeyObject object = new KeyObject(1,"abc");
		final KeyObject object1 = new KeyObject(1,"abc");

		System.out.println(object.equals(object1));
		System.out.println(object.hashCode()==object1.hashCode());

		final Map<KeyObject, Integer> map = new HashMap<>();
		map.put(object, 0);
		map.put(object1, 1);

		System.out.println(map.get(object));
		System.out.println(map.get(object1));

		System.out.println(map.size());
	}

}
