package com.bank;

public class SavingsAccount extends Account implements Comparable<Account> {

	public SavingsAccount(String label, Client client, double balance) {
		super(label, client);
		this.balance = balance;
	}

}
