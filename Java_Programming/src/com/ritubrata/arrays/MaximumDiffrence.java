package com.ritubrata.arrays;

public class MaximumDiffrence {
	static int findDiffIfBigElementPresentAfterSmallOne(final int arr[]){
		int max_diff = arr[1] - arr[0];
		final int arr_size = arr.length;
		for (int i = 0; i < arr_size; i++){
			for (int j = i + 1; j < arr_size; j++){
				if (arr[j] - arr[i] > max_diff) {
					max_diff = arr[j] - arr[i];
				}
			}
		}
		return max_diff;
	}

	public static void main(final String[] args){
		final int arr[] = {13, 14, 18, 10, 12, 16, 9, 10};
		System.out.println("Maximum differnce is " +
				findDiffIfBigElementPresentAfterSmallOne(arr));
	}
}
