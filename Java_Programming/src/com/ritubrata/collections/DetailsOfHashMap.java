package com.ritubrata.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DetailsOfHashMap {

	public static void findMaxKeyAndValue(final Map<Integer, Integer> map) {
		final Integer maxKey = map.entrySet().stream().max((m1,m2)-> m1.getKey()> m2.getKey()? 1 : -1).get().getKey();
		final Integer maxValue = map.entrySet().stream().max((m1,m2)-> m1.getValue()> m2.getValue() ? 1 : -1).get().getValue();
		System.out.println("Max key is : " + maxKey + " Max value is : " + maxValue);
		System.out.println("*******************************************************************");
	}

	public static void findMinKeyAndValue(final Map<Integer, Integer> map) {
		final Integer minKey = map.entrySet().stream().min((m1,m2)-> m1.getKey() > m2.getKey() ? 1 : -1).get().getKey();
		final Integer minValue = map.entrySet().stream().min((m1,m2)-> m1.getValue()  > m2.getValue() ? 1 : -1).get().getValue();
		System.out.println("Min key is : " + minKey + " Min value is : " + minValue);
		System.out.println("*******************************************************************");
	}

	public static HashMap<String, Integer> sortByValue(final HashMap<String, Integer> hm){
		final List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		Collections.sort(
				list,
				new Comparator<Map.Entry<String, Integer> >() {
					@Override
					public int compare(
							final Map.Entry<String, Integer> object1,
							final Map.Entry<String, Integer> object2){
						return object1.getValue()
								.compareTo(object2.getValue());
					}
				});

		final HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
		for (final Map.Entry<String, Integer> me : list) {
			result.put(me.getKey(), me.getValue());
		}
		return result;
	}

	public static HashMap<String, Integer> sortByKey(final HashMap<String, Integer> hm){
		final List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
		Collections.sort(
				list,
				new Comparator<Map.Entry<String, Integer> >() {
					@Override
					public int compare(
							final Map.Entry<String, Integer> object1,
							final Map.Entry<String, Integer> object2){
						return object1.getKey()
								.compareTo(object2.getKey());
					}
				});

		final HashMap<String, Integer> result = new LinkedHashMap<String, Integer>();
		for (final Map.Entry<String, Integer> me : list) {
			result.put(me.getKey(), me.getValue());
		}
		return result;
	}

	public static void printHashMap() {
		final Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(10, 50);
		map.put(5, 75);
		map.put(null, 200);
		map.put(3, null);
		map.put(1, 150);
		map.put(null, 300);
		map.put(7, null);
		map.putIfAbsent(5, 65); // key 5 is already present so it will not be inserted
		map.putIfAbsent(8, null);
		System.out.println(map);
		System.out.println("*******************************************************************");
	}

	public static void main(final String[] args) {
		printHashMap();

		final Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(10, 50);
		map.put(5, 75);
		map.put(1, 150);
		findMaxKeyAndValue(map);
		findMinKeyAndValue(map);

		final HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("five", 5);
		hashmap.put("seven", 7);
		hashmap.put("three", 3);
		hashmap.put("nine", 9);
		hashmap.put("zero", 0);
		hashmap.put("eight", 8);

		System.out.println("SORT BY KEY ---------------> ");
		final Map<String, Integer> sortedMapbyKey = sortByKey(hashmap);
		for (final Map.Entry<String, Integer> entry :
			sortedMapbyKey.entrySet()) {
			System.out.println("Key : " + entry.getKey()
			+ ", Value : "
			+ entry.getValue());
		}

		System.out.println("SORT BY VALUE -------->  ");
		final Map<String, Integer> sortedMapbyValue = sortByValue(hashmap);
		for (final Map.Entry<String, Integer> entry :
			sortedMapbyValue.entrySet()) {
			System.out.println("Key : " + entry.getKey()
			+ ", Value : "
			+ entry.getValue());
		}
	}
}
