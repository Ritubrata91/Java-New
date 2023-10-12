package com.ritubrata.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

class ArrayContainer implements Comparable<ArrayContainer> {
	int[] arr;
	int index;

	public ArrayContainer(final int[] arr, final int index) {
		this.arr = arr;
		this.index = index;
	}

	@Override
	public int compareTo(final ArrayContainer o) {
		return this.arr[this.index] - o.arr[o.index];
	}
}

public class MergeArrays {
	public static int[] mergeKSortedArray(final int[][] arr) {
		//PriorityQueue is heap in Java
		final PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
		int total=0;
		//add arrays to heap
		for (int i = 0; i < arr.length; i++) {
			queue.add(new ArrayContainer(arr[i], 0));
			total = total + arr[i].length;
		}
		int m=0;
		final int result[] = new int[total];
		//while heap is not empty
		while(!queue.isEmpty()){
			final ArrayContainer ac = queue.poll();
			result[m++]=ac.arr[ac.index];
			if(ac.index < ac.arr.length-1){
				queue.add(new ArrayContainer(ac.arr, ac.index+1));
			}
		}
		return result;
	}
	public static void main(final String[] args) {
		final int[] arr1 = { 1, 3, 5, 7 };
		final int[] arr2 = { 2, 4, 6, 8 };
		final int[] arr3 = { 0, 9, 10, 11 };
		final int[] result = mergeKSortedArray(new int[][] { arr1, arr2, arr3 });
		System.out.println(Arrays.toString(result));
	}
}
