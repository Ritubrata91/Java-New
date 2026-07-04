package com.ritubrata.integers;

import java.math.BigInteger;

public class Factorial {
	static BigInteger factorial(final int N){
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
		for (int i = 2; i <= N; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
	public static void main(final String args[]) throws Exception{
		final int N = 5;
		System.out.println(factorial(N));
	}
}
