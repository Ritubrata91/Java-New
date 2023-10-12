package com.ritubrata.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindSubArrayWithSumZero {
	static Boolean subArrayExists(final int arr[]){
		final Set<Integer> hs = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
			if (arr[i] == 0
					|| sum == 0
					|| hs.contains(sum)) {
				return true;
			}
			hs.add(sum);
			System.out.println(hs);
		}
		return false;
	}
	public static void main(final String arg[]){
		final int arr[] = { -3, 2, 3, 1, 6 };
		if (subArrayExists(arr)) {
			System.out.println(
					"Found a subarray with 0 sum");
		} else {
			System.out.println("No Such Sub Array Exists!");
		}
	}
}
