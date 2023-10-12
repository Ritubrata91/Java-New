package com.ritubrata.InheritanceAndStatic;

public class StaticBlockWithInheritanceChild extends StaticBlockWithInheritanceParent{
	static {
		System.out.println("Static Child");
	}
	StaticBlockWithInheritanceChild() {
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		StaticBlockWithInheritanceParent p;
	}
}
