package com.ritubrata.InheritanceAndStatic;

public class InterfaceImplementedClass implements DefaultAndStaticMethodInterface {

	@Override
	public void abstractMethod(final String str) {
		System.out.println("Abstract Method in child class " + str);
	}

	@Override
	public void defaultMethod() {
		System.out.println("Default method overridden in child class.");
	}

	static void staticMethod() {
		System.out.println("Static method overridden in child class.");
	}

	public static void main(final String[] args) {
		final InterfaceImplementedClass obj = new InterfaceImplementedClass();
		obj.abstractMethod("abc");
		obj.defaultMethod();
		InterfaceImplementedClass.staticMethod();
		DefaultAndStaticMethodInterface.staticMethod();
	}
}
