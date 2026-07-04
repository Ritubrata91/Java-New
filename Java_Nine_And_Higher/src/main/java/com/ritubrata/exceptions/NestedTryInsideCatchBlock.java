package com.ritubrata.exceptions;

public class NestedTryInsideCatchBlock {

	public static void main(final String args[]){
		try	{
			System.out.print("A");
			throw new Exception();
		}catch (final Exception e){
			try{
				try{
					throw new Exception();
				}catch (final Exception ex){
					System.out.print("B");
				}
				throw new Exception();
			}catch (final Exception exc){
				System.out.print("C");
			}finally{
				System.out.print("D");
			}
		}finally{
			System.out.print("E");
		}
		System.out.print("F");
	}

}
