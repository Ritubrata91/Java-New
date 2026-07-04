package com.ritubrata.string;

import java.util.Scanner;

public class CountNumberOfWordsInString {
	public static void main(final String[] args){
		System.out.println("Enter the string");
		try(final Scanner sc = new Scanner(System.in)){
			final String s=sc.nextLine();
			final String[] words = s.trim().split(" ");
			System.out.println("Number of words in the string = "+words.length);
		}
	}

}
