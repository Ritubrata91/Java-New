package com.ritubrata.string;

public class StringBufferDemo {

	public static String sol(final int N) {
		final StringBuffer sb = new StringBuffer();
		for(int i =1; i<= N;i++) {
			if(i%2==0) {
				sb.append("-");
			}else {
				sb.append("+");
			}
		}
		return sb.toString();
	}

	public static void main(final String[] args) {
		System.out.println(sol(5));
	}

}
