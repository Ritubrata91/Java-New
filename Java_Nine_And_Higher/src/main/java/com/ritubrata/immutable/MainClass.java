package com.ritubrata.immutable;

public class MainClass {
	public static void main(final String[] args) throws Exception {
		final Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));
		final Address address = emp.getAddress();
		System.out.println(address);
		address.setLocation("Hi-tech City");
		address.setAddressType("Office");
		address.setCity("Hyderabad");
		System.out.println(emp.getAddress());
	}
}
