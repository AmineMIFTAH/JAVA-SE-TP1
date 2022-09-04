package com.bank;

public class CurrentAccount extends Account implements Comparable<Account> {

	public CurrentAccount(String label, Client client, double balance) {
		super(label, client);
		this.balance = balance;
	}
}
