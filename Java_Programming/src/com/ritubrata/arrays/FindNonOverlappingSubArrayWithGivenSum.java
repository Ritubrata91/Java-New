package com.ritubrata.arrays;

import java.util.HashMap;

class FindNonOverlappingSubArrayWithGivenSum {
	public static int solution(final int[] A, final int target) {
		int ans = 0;
		int availIdx = -1;
		int cur_sum = 0;
		final HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp.put(0, 1);

		for(int i = 0; i < A.length; i++){
			cur_sum += A[i];
			if (mp.containsKey(cur_sum - target) &&
					mp.get(cur_sum - target) >= availIdx){
				ans++;
				availIdx = i;
			}
			mp.put(cur_sum, i);
		}
		return ans;
	}


	public static void main(final String[] args){
		final int arr[] = { 2, -1, 4, 3,
				6, 4, 5, 1 };
		final int target = 6;
		System.out.print(solution(arr, target));
	}
}

