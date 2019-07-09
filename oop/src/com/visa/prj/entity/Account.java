package com.visa.prj.entity;

/**
 * 
 * This is an entity class to represent 
 * account business data
 * 
 * @author Jittam
 * @version 1.0
 *
 */

public class Account{
	private double balance;
	private String accNo;
	
	private static int count; // state of account
	
	public Account(String no) {
		count++;
		this.accNo = no;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Account other = (Account) obj;
		
 		return this.accNo.equals(other.accNo);
	}

	/**
	 * method to deposit amount in the bank account
	 * 
	 * @param amount amount to be credited
	 */
	public void deposit(double  amount) {
		balance = balance + amount;
	}
	
	public void getaccNo(String no) {
		this.accNo = no;
	}
	
	
	/**
	 * method to return the balance amount
	 * 
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public static int  getCount() {
		return count;
	}
}