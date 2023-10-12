package com.ritubrata.arrays;

public class LargestSubArray {

	int findSubArray(final int arr[]){
		final int size = arr.length;
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex;
		for (int i = 0; i < size - 1; i++) {
			sum = arr[i] == 0 ? -1 : 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] == 0) {
					sum += -1;
				} else {
					sum += 1;
				}
				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		if (maxsize == -1) {
			System.out.println("No such subarray");
		} else {
			System.out.println(startindex + " to " + endindex);
		}
		return maxsize;
	}
	public static void main(final String[] args){
		LargestSubArray sub;
		sub = new LargestSubArray();
		final int arr[] = { 1, 0, 0, 1, 1, 1, 0, 0, 1 };
		sub.findSubArray(arr);
	}
}
