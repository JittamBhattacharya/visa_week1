package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {
	
	public static void main(String[] args) {
		
		Account first = new Account("sbi123");     
		Account second  = new Account("axis123");
		
		first.deposit(5000); 					// deposit ( first , 5000);
		second.deposit(2500);					// deposit ( second , 2500);

		System.out.println("first account");
		System.out.println("Balance : " + first.getBalance() );
		
		System.out.println("second account");
		System.out.println("Balance : " + second.getBalance());
			
		Account rahul  = new Account("sbi100");
		Account swetha = new Account("sbi123");
		
		Account ref  = rahul;
		
		if(ref == rahul) {
			System.out.println("ref and rahul points to same location");
		}
		if(rahul.equals(swetha)) {
			
			System.out.println("Same Content");
		}
		
		 System.out.println("Count : " + Account.getCount());
	
}

}