package com.account;

import java.util.Date;

public class Transaction {
	
	private static long transactionCount = 0;

    private long transactionId;
    private Date dateTime;
    private double TotalValue;
    private String type;

    public Transaction(double TotalValue,String type) {
        this.transactionId = ++transactionCount;
        this.dateTime = new Date();
        this.TotalValue = TotalValue;
        this.type=type;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public double getTotalValue() {
        return TotalValue;
    }

	@Override
	public String toString() {
		return "transactionId=" + transactionId + ", dateTime=" + dateTime + ", TotalValue=" + TotalValue
				+ ", type=" + type;
	}

   
}
