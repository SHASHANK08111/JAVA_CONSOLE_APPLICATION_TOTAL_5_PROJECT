package com.account;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Account {
	private static int counter=0;
	private long AccountNumber;
	private double balance;
	private Date dateOpened;
	public HashMap<Long,Transaction> transactions=new HashMap<>();
	
	public Account() {
		this.AccountNumber=generateAccountNumber();
		this.balance=0.0;
		dateOpened=new Date();
	}

	private long generateAccountNumber() {
		counter++;
		return (long)(11111111+counter);
	}

	public static int getCounter() {
		return counter;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public Date getDateOpened() {
		return dateOpened;
	}
	
	public HashMap<Long,Transaction> getTransactions() {
	       return transactions;
	 }

    public void addTransaction(Transaction transaction) {
           transactions.put(transaction.getTransactionId(),transaction);
    }
	
	public void makeDeposite(int amount) {
		balance+=amount;
	}
	
	public double makeWithdrawal(int amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			return amount;
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return "AccountNumber=" + AccountNumber + ", balance=" + balance + ", dateOpened=" + dateOpened
				+ ", transactions=" + transactions.values();
	}
	
}
