package com.ritubrata.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayElementCount {
	static void byUsingMap(final int inputArray[]){
		final HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		if(inputArray.length == 0) {
			System.out.println("Array Is Empty");
		}else {
			for (final int i : inputArray){
				if(elementCountMap.containsKey(i)){
					elementCountMap.put(i, elementCountMap.get(i)+1);
				}else {
					elementCountMap.put(i, 1);
				}
			}
			System.out.println("Input Array : "+Arrays.toString(inputArray));
			System.out.println("Element Count : "+elementCountMap);
			System.out.println("=======================================");
		}
	}

	static void byUsingStreeam(){
		final List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");

		final Map<String, Long> frequencyMap =
				list.stream().collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()));

		for (final Map.Entry<String, Long> entry: frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void main(final String[] args){
		byUsingMap(new int[]{4, 5, 4, 5, 4, 6});
		byUsingMap(new int[]{});
		byUsingStreeam();
	}
}
