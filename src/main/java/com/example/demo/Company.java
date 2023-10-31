package com.example.demo;

public class Company {

	private String companyName;
	private String address;
	private String GSTNumber;
	private String code;

	public String getGSTNumber() {
		return GSTNumber;
	}

	public void setGSTNumber(String gSTNumber) {
		GSTNumber = gSTNumber;
	}

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", address=" + address + ", GSTNumber=" + GSTNumber + ", code="
				+ code + "]";
	}

}
