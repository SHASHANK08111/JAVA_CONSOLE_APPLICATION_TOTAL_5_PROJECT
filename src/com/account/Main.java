package com.account;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
   
	public static void main(String[] args) {
	    BankingSystem b=new BankingSystem();
		while(true) {
		 	System.out.println("\nPlease select from the menu below:");
	        System.out.println("1. Create Personal Customer");
	        System.out.println("2. Create Commercial Customer");
	        System.out.println("3. Record Transaction");
	        System.out.println("4. Make Withdrawal");
	        System.out.println("5. Display Customer");
	        System.out.println("6. Display Customer Summary");
	        System.out.println("7. Display Grand Summary");
	        System.out.println("8. Total Transaction details");
	        System.out.println("9. Add New Account for existing user");
	        System.out.println("10. Exit");
	        System.out.print("Enter your choice: ");
	        int ch=sc.nextInt();
	        switch(ch) 
	        {
	         case 1:
	        	 System.out.println("Enter customer name");
	     		 String customername=sc.next();
	     		 System.out.println("Enter the address detail");
	    		 String customerAddress=sc.next();
	    		 System.out.println("Enter Home Phone Number");
	    		 String homePhone=sc.next();
	    		 System.out.println("Enter the Work Phone");
	    		 String workPhone=sc.next();
	    		 System.out.println(b.CreatePersonalCustomer(customername,customerAddress,homePhone,workPhone).toString());
	        	 break;
	         case 2:
	        	 System.out.println("Enter customer name");
	     		 String customernamec=sc.next();
	     		 System.out.println("Enter the address detail");
	    		 String customerAddressc=sc.next();
	    		 System.out.println("Enter the contact person details");
	    		 String contactPersonc=sc.next();
	    		 System.out.println("Enter the contact Person Phone");
	    		 String contactPersonPhonec=sc.next();
	        	 System.out.println(b.CreateCommercialCustomer( customernamec,customerAddressc,contactPersonc,contactPersonPhonec).toString()) ;
	        	 break;
	         case 3:
	        	 System.out.println("Enter the customer Id");
	     		 long customerId=sc.nextInt();
	     		 System.out.println("Enter the Account Number Id");
	     		 long AccountNumber=sc.nextInt();
	     		 System.out.println("Enter the deposite amount");
	    		 double TotalValue=sc.nextDouble();
	        	 System.out.println(b.RecordTransaction(customerId,AccountNumber, TotalValue).toString());
	        	 break;
	         case 4:
	        	 System.out.println("Enter the customer Id");
	     		 long customerId1=sc.nextInt();
	     		 System.out.println("Enter the Account Number Id");
	     		 long AccountNumber1=sc.nextInt();
	     		 System.out.println("Enter the WithDrwal amount");
	    		 double TotalValue1=sc.nextDouble();
	    		 System.out.println("Transaction Details");
	        	 System.out.println(b.MakeWithdrawal(customerId1,AccountNumber1,TotalValue1).toString());
	        	 break;
	         case 5:
	        	 System.out.println("Enter the customerId");
	        	 long customerId2=sc.nextInt();
	        	 System.out.println(b.findCustomer(customerId2));	
	        	 break;
	         case 6:
	        	 HashMap<Long,Customer> customers= b.findAllCustomer();
	        	 System.out.println("Total Number of Customer :"+customers.size());
	     		 for(Customer customer:customers.values()) {
	     			System.out.println(customer.customerName+"    --> "+b.findSumofCustomer(customer.getCustomerId()));
	     		}
	        	 break;
	         case 7:
	        	 HashMap<Long,Customer> customers1= b.findAllCustomer();
	        	 for(Customer customer:customers1.values()) {
	         		System.out.println(customer);
	     			System.out.println("--------------------------------------------------------------------------------------------------------------------");
	     		}
	        	 break;
	         case 8:
	        	 System.out.println("Enter the customer Id");
	     		 long customerId4=sc.nextInt();
	     		 System.out.println("Enter the Account Number Id");
	     		 long AccountNumber4=sc.nextInt();
	     		 System.out.println(b.findTotalNumberOfTransaction(customerId4,AccountNumber4));
	     		 break;
	         case 9:
	        	 System.out.println("Enter the customer Id");
	     		 long customerId5=sc.nextInt();
	     		 System.out.println(b.AddNewAccount(customerId5));
	        	 break;
	         case 10:
	        	 return;
	         default:
	        	 System.out.println("Wrong option");
	        }
	    }	
		
	}
	
	
}
