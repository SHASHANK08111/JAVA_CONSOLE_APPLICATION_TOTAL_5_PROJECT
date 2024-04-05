package com.account;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class BankingSystem {
    private static HashMap<Long,Customer> customers=new HashMap<>();
    static Scanner sc=new Scanner(System.in);

	
	
	public Customer CreatePersonalCustomer(String customername,String customerAddress,String homePhone,String workPhone ) {
		Customer c=new PersonalCustomer(customername);
		c.setCustomerAddress(customerAddress);
		c.setHomePhone(homePhone);
		c.setWorkPhone(workPhone);
		customers.put(c.getCustomerId(),c);
		return c;
	}
	
   public Customer CreateCommercialCustomer(String customernamec,String customerAddressc,String contactPersonc,String contactPersonPhonec) {
		Customer c=new CommercialCustomer(customernamec);
		c.setCustomerAddress(customerAddressc);
		c.setContactPerson(contactPersonc);
		c.setContactPersonPhone(contactPersonPhonec);
		customers.put(c.getCustomerId(),c);
		return c;
	}
	
	
   public Transaction RecordTransaction(long customerId,long AccountNumber,double TotalValue) {
   	String type="Deposite";
   	Transaction transaction;
		Customer customer=findCustomer(customerId);
		Account account=findAccount(customerId,AccountNumber);
		if(customer==null) {
			transaction=null;
		}else if(account==null){
			transaction=null;
		}
		else
		{
			account.makeDeposite((int)TotalValue);
			transaction=new Transaction(TotalValue,type);
			account.addTransaction(transaction);
		}
		return transaction;
	}
   
   public Transaction MakeWithdrawal(long customerId,long AccountNumber,double TotalValue) {
		String type="WithDraw";
		Transaction transaction;
		Customer customer=findCustomer(customerId);
		Account account=findAccount(customerId,AccountNumber);
		if(customer==null) {
			transaction=null;
		}else {
			account.makeWithdrawal((int)TotalValue);
		    transaction=new Transaction(TotalValue,type);
			account.addTransaction(transaction);
		}
		return transaction;
  	}
   
   
    public Customer findCustomer(long customerId) {
    	if(customers.get(customerId)!=null) {
    		return customers.get(customerId);
    	}
		return null;
	}
    
    
    public HashMap<Long,Customer> findAllCustomer(){
    	return customers;
    }
    
    
    public Account findAccount(long customerId, long accountNumber) {
        Customer customer = findCustomer(customerId);
        if (customer != null) {
            HashMap<Long, Account> accounts = customer.getAccount();
            //System.out.println("Customer's accounts: " + accounts);
            return accounts.get(accountNumber);
        }
        return null;
    }
  
    
    public double findSumofCustomer(long customerId) {
    	double TotalAccount=0.0;
    	Customer customer=findCustomer(customerId);
    	HashMap<Long,Account> Accounts=customer.getAccount();
    	for(Account account:Accounts.values()) {
    		TotalAccount+=account.getBalance();
    	}
    	
    	return TotalAccount;
    }
    
    
    public int findTotalNumberOfTransaction(long customerId, long accountNumber) {
    	 Account account=findAccount(customerId,accountNumber);
    	 return account.getTransactions().size();
    }
    
//    public int findTotalNumberOfTransactionByCustomer(long customerId) {
//     int TotalTransaction=0;
//     Customer customer=findCustomer(customerId);
//     HashMap<Long,Account> Accounts=customer.getAccount();
//    
//   	 return TotalTransaction;
//   }

    public Customer AddNewAccount(long customerId) {
    	Customer customer=findCustomer(customerId);
    	if(customer!=null) {
    		Account account=new Account();
    		customer.addAcount(account);
    	}
    	return customer;
    }
    
}
