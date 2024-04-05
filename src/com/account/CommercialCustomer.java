package com.account;

public class CommercialCustomer extends Customer {

	private String contactPerson;
	private String contactPersonPhone;
	
	public CommercialCustomer(String customerName) {
		super(customerName);
		this.customerId=++customerCount;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	@Override
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactPersonPhone() {
		return contactPersonPhone;
	}

	@Override
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
	
	 @Override
	 public String toString() {
	     return super.toString() + " Contact Person: " + contactPerson + " Contact Person Phone: " + contactPersonPhone +"\n";
	 }

}
