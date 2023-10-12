package com.ritubrata.exceptions;

public class ExceptionInTryCatchFinally {

	public static void main(final String[] args) {
		try{
			throw new ArithmeticException();
		}catch(final ArrayIndexOutOfBoundsException e){
			throw new NullPointerException();
		}finally{
			throw new NumberFormatException();
		}
	}
}
