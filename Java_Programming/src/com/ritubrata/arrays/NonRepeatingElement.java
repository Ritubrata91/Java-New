package com.ritubrata.arrays;

public class NonRepeatingElement {

	static int firstNonRepeating(final int arr[]){
		final int n = arr.length;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < n; j++) {
				if (i != j && arr[i] == arr[j]) {
					break;
				}
			}
			if (j == n) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(final String[] args){
		final int arr[] = { 9, 4, 9, 6, 7, 4 };
		System.out.println("First Non Prepeating Element is : " + firstNonRepeating(arr));
	}
}
