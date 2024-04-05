package com.account;

public class PersonalCustomer extends Customer {

	private String homePhone;
	private String workPhone;
	
	public PersonalCustomer(String customerName) {
		super(customerName);
		this.customerId=++customerCount;
	}
	

	public String getHomePhone() {
		return homePhone;
	}

	@Override
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}
    
	@Override
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}	
	
	@Override
    public String toString() {
        return super.toString() + " Home Phone: " + homePhone + " Work Phone: " + workPhone+"\n";
    }
}
