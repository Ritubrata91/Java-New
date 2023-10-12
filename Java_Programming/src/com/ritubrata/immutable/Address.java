package com.ritubrata.immutable;

class Address implements Cloneable {
	public String addressType;
	public String location;
	public String city;
	public Address(final String addressType, final String address, final String city) {
		this.addressType = addressType;
		this.location = address;
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(final String addressType) {
		this.addressType = addressType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(final String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(final String city) {
		this.city = city;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address Type - "+addressType+", address - "+location+", city - "+city;
	}
}

