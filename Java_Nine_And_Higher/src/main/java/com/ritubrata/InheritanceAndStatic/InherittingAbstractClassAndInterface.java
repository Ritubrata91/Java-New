package com.ritubrata.InheritanceAndStatic;

public class InherittingAbstractClassAndInterface extends AbstractClassExample implements InterfaceExample {

	@Override
	public void display() {
		System.out.println("Display");
	}

	public static void main(final String[] args) {
		final InherittingAbstractClassAndInterface obj = new InherittingAbstractClassAndInterface();
		obj.display();
	}
}
