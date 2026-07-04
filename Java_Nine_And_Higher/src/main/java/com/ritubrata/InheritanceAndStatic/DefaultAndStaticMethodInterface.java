package com.ritubrata.InheritanceAndStatic;

public interface DefaultAndStaticMethodInterface {

	default void defaultMethod() {
		System.out.println("Default method in Interface");
	}

	static void staticMethod() {
		System.out.println("Static method in Interface");
	}

	void abstractMethod(String str);
}


