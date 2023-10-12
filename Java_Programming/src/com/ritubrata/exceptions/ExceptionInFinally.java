package com.ritubrata.exceptions;

public class ExceptionInFinally {
	public static void main(final String args[]){
		try {
			System.out.println("A");
			throw new Exception();
		}catch (final ArithmeticException e){
			System.out.println("B");
		}catch (final Exception e){
			System.out.println("C");
		} finally{
			System.out.println("D");
			final int num = 7/0; 
			System.out.println("E");
		}
		System.out.println("F");
	}
}
