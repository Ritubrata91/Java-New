package com.ritubrata.arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class FindMedianAndFarthestFromZero {

	public static int farthestfromzero(final int N, final int [] Arr) {
		final TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i=0; i<N; i++){
			ts.add(Arr[i]);
		}
		final int maxV = ts.last();
		final int minV = ts.first();

		if(Math.abs(minV) >= maxV){
			return minV;
		}
		return maxV;

	}

	public static double median(final int[] numArray) {
		Arrays.sort(numArray);
		if (numArray.length % 2 == 0) {
			return ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
		} else {
			return numArray[numArray.length/2];
		}
	}

	public static void main(final String[] args) {
		System.out.println(median(new int[]{-10,-20,4,-5,15,7}));
		System.out.println(farthestfromzero(6,new int[]{-10,-20,4,-5,15,7}));
	}
}
