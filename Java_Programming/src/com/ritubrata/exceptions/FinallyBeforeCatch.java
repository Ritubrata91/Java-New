package com.ritubrata.exceptions;

public class FinallyBeforeCatch {

	public static void main(final String[] args) {
		try{
			System.out.println("A");
			throw new Exception();
		}finally{
			System.out.println("B");
		}catch(Exception e){
			System.out.println("C");
		}
	}

}
