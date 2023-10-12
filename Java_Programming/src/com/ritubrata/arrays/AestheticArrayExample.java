package com.ritubrata.arrays;

public class AestheticArrayExample {

	public static int solution(final int[] A) {
		if(A.length ==0 || A.length==1) {
			return 0;
		}else if (A.length ==2) {
			return A[0] != A[1] ? 0 : 1;
		}else {
			int count = 0;
			for (int i = 0; i < A.length - 2 ; i += 2) {
				final int a = A[i];
				final int b = A[i+1];
				final int c = A[i + 2];
				if (!(a - b > 0 && b - c < 0) && !(a - b < 0 && b - c > 0)) {
					count ++;
				}
			}
			return count;
		}
	}

	public static void main(final String[] args){
		System.out.println(solution(new int[]{4, 5, 4, 5, 4, 6}));
		System.out.println(solution(new int[]{5, 4, 3, 2, 6}));
		System.out.println(solution(new int[]{3, 7, 4, 5}));
		System.out.println(solution(new int[]{5, 4}));
		System.out.println(solution(new int[]{0}));
	}

}
