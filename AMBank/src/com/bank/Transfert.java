package com.bank;

public class Transfert extends Flow {
	private int accountNumber;
	
	public Transfert(double amount, int targetAccountNumber) {
		super(amount, targetAccountNumber);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
