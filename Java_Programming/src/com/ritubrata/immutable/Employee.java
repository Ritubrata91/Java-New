package com.ritubrata.immutable;

final class Employee {
	private final String empName;
	private final int age;
	private final Address address;
	public Employee(final String name, final int age, final Address address) {
		this.empName = name;
		this.age = age;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public int getAge() {
		return age;
	}
	/* public Address getAddress() {
	      return address;
	      }
	 */
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
}