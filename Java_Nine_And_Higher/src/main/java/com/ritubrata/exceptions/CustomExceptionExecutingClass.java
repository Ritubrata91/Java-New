package com.ritubrata.exceptions;

public class CustomExceptionExecutingClass {
	static void calculate(final int i) throws CustomException{
		throw new CustomException(i);
	}
	public static void main(final String[] args) {
		try {
			calculate(42);
		}catch(final CustomException e){
			System.out.println("Catch22");
		}
	}

}
