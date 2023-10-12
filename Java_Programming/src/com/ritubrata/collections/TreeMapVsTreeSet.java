package com.ritubrata.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapVsTreeSet {
	public static void main(final String[] args)
	{
		final TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("geeks");
		treeSet.add("FOR");
		treeSet.add("geeks");
		treeSet.add("tutorial");
		//treeSet.add(null);     NullPointerException
		System.out.println("Treeset Sorted by object value."
				+ " Treeset does not allow duplicates . Treeset does not allow Null");
		System.out.println(treeSet);

		System.out.println("***********************************************************"
				+ "************************************************");

		final TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(2, "FOR");
		treeMap.put(1, "geeks");
		treeMap.put(3, "geeks");
		treeMap.put(3, "abc");
		treeMap.put(10, "geeks");
		treeMap.put(4, "tutorial");
		treeMap.put(4, "null");
		treeMap.put(14, "null");
		//treeMap.put(null, "abc");     NullPointerException
		System.out.println("Treemap Sorted by key. "
				+ " Treemap overrirdes value of same key. "
				+ "Treemap allow duplicate value of different keys. "
				+ "Treemap allows more than one Null value but no null key. ");
		System.out.println(treeMap);

	}
}
