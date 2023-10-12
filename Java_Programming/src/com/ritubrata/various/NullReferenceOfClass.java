package com.ritubrata.various;

public class NullReferenceOfClass {

	static void method1(NullReference emp) {
		emp = null;
	}

	static NullReference method2(NullReference emp) {
		emp = new NullReference("abc");
		return emp;
	}


	public static void main(final String[] args) {
		final NullReference emp = new NullReference("abc");

		method1(emp);
		System.out.println(emp.getName());

		final NullReference emp2= method2(emp);

		System.out.println(emp==emp2);
		System.out.println(emp.equals(emp2));
	}

}
