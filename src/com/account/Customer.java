package com.account;

import java.util.HashMap;
import java.util.LinkedList;

public class Customer {
	
	protected static long customerCount=0;
	protected String customerName;
	protected long customerId;
	protected String customerAddress;
	public HashMap<Long,Account> Accounts=new HashMap<>();
	
	public Customer(String customerName) {
		this.customerName=customerName;
		Account account=new Account();
		Accounts.put(account.getAccountNumber(),account);
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public HashMap<Long,Account> getAccount() {
		return Accounts;
	}
	
	public void addAcount(Account account) {
		Accounts.put(account.getAccountNumber(),account);
	}
	
	@Override
	public String toString() {
		return "customerName=" + customerName + ", customerId=" + customerId + ", customerAddress="
				+ customerAddress + ", Accounts=" + Accounts.values();
	}

	
	public void setHomePhone(String homePhone) {
		
	}

	public void setWorkPhone(String workPhone) {
		
		
	}

	public void setContactPerson(String contactPerson) {
		
		
	}

	public void setContactPersonPhone(String contactPersonPhone) {
	
		
	}
	
	

}
