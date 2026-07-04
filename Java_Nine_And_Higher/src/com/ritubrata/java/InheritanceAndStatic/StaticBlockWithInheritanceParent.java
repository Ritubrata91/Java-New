package com.ritubrata.java.InheritanceAndStatic;

public class StaticBlockWithInheritanceParent {
	static {
		System.out.println("Static Parent");
	}
	StaticBlockWithInheritanceParent() {
		System.out.println("Parent Constructor");
	}
}
