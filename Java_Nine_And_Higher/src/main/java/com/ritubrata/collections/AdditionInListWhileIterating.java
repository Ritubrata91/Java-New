package com.ritubrata.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AdditionInListWhileIterating {
	public static void main(final String[] args) {
		final List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");

		final Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //ConcurrentModificationException
			list.add("gh");
		}

		final ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next()); //ConcurrentModificationException
			list.add("gh");
		}
	}

}
