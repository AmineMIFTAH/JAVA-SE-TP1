package com.bank;

public class Transfert extends Flow {
	private int accountNumber;
	
	public Transfert(double amount, int targetAccountNumber, int accountNumber) {
		super(amount, targetAccountNumber);
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
