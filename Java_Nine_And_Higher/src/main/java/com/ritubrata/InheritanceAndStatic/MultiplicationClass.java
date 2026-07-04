package com.ritubrata.InheritanceAndStatic;

public class MultiplicationClass implements MultiplicationOne, MultiplicationTwo {

	@Override
	public void result() {
		MultiplicationOne.super.result();
		MultiplicationTwo.super.result();
	}

	public static void main(final String[] args) {
		final MultiplicationClass mc = new MultiplicationClass();
		mc.result();
	}

}
