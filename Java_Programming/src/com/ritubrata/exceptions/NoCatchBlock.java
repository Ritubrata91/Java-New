package com.ritubrata.exceptions;

public class NoCatchBlock {
	public static void main(final String[] args) {
		try{
			System.out.println("A");
			throw new Exception();
		}finally{
			System.out.println("B");
		}
	}
}
