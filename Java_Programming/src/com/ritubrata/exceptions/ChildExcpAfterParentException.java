package com.ritubrata.exceptions;

public class ChildExcpAfterParentException {

	public static void main(final String args[]){
		try	{
			final int arr[]= {1, 2, 3, 4, 5};
			for (int i = 0; i <= 5; i++){
				System.out.print ("Array elements are : " + arr[i] + "\n");
			}
		}catch (final Exception e){
			System.out.println ("Exception : " + e);
		}catch (final ArrayIndexOutOfBoundsException ex){
			System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
		}
	}
}


