package com.example.demo;

public class Company {

	private String companyName;
	private String address;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", address=" + address + "]";
	}

}
