package com.ritubrata.exceptions;

import java.util.Scanner;

public class UseOfCustomCheckedException {
	private final String name;
	private final int age;

	public UseOfCustomCheckedException(final String name, final int age){
		this.name = name;
		this.age = age;
	}

	public static boolean containsAlphabet(final String name) {
		for (int i = 0; i < name.length(); i++) {
			final char ch = name.charAt(i);
			if (!(ch >= 'a' && ch <= 'z')) {
				return false;
			}
		}
		return true;
	}

	public void validateInput() throws NotProperNameException {
		if(!containsAlphabet(name)&&name!=null) {
			final String msg = "Improper name (Should contain only characters between a to z (all small))";
			final NotProperNameException exName = new NotProperNameException(msg);
			throw exName;
		}
	}

	public void display(){
		try {
			validateInput();
			System.out.println("Name of the Student: "+this.name );
			System.out.println("Age of the Student: "+this.age );
		} catch (final NotProperNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(final String args[]) {
		try(final Scanner sc= new Scanner(System.in)){
			System.out.println("Enter the name of the person: ");
			final String name = sc.next();
			System.out.println("Enter the age of the person: ");
			final int age = sc.nextInt();
			final UseOfCustomCheckedException obj = new UseOfCustomCheckedException(name, age);
			obj.display();
		}
	}
}
