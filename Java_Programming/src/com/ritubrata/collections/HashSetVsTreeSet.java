package com.ritubrata.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {
	public static void main(final String[] args) {
		final HashSet<String> hset = new HashSet<String>();
		hset.add("geeks");
		hset.add("for");
		hset.add("practice");
		hset.add("contribute");
		hset.add("geeks");
		hset.add(null);
		hset.add(null);
		System.out.println("HashSet unordered and contains single null");
		System.out.println("HashSet contains: ");
		for (final String temp : hset) {
			System.out.println(temp);
		}

		System.out.println("***********************************************************"
				+ "************************************************");

		final TreeSet<String> tset = new TreeSet<String>();
		tset.add("geeks");
		tset.add("for");
		tset.add("practice");
		tset.add("contribute");
		tset.add("geeks");
		//tset.add(null);
		System.out.println("Treeset ordered and does not contain null");
		System.out.println("TreeSet contains: ");
		for (final String temp : tset) {
			System.out.println(temp);
		}
	}

}
