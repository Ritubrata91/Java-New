package com.ritubrata.exceptions;

public class CustomException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = -4980833184050263390L;
	int num;

	public CustomException(final int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return Integer.toString(num);
	}

}
