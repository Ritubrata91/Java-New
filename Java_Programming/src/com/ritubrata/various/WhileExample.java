package com.ritubrata.various;

public class WhileExample {
	public static void main(final String[] args) {
		int i =0;
		while(true) {
			if(i++ ==4) {
				break;
			}
			++i;
		}
		System.out.println("i = " +i++);
	}

}
