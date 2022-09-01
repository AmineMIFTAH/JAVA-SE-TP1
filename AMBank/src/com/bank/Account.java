package com.bank;

public abstract class Account implements Comparable<Account> {
	protected String label;
	protected double balance;
	protected int accountNumber;
	protected Client client;
	
	
	/* Methods */
	
	static int accNumber = 0;
	
	public Account(String label, Client client ) {
		this.label = label;
		this.client = client;
		Account.accNumber++;
		this.accountNumber = Account.accNumber;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount, Flow flow) {
		if(flow instanceof Credit)
			this.balance += amount;
		
		if(flow instanceof Debit) {
			if(amount > this.balance)
				System.out.println("Set Balance fails using Debit");
			else
				this.balance -= amount;
		}
		
		if(flow instanceof Transfert) {
			if(this.accountNumber == flow.getTargetAccountNumber())
				this.balance += amount;

			if(this.accountNumber == ((Transfert) flow).getAccountNumber()) {
				if(amount > this.balance)
					System.out.println("Set Balance fails using Transfert");
				else
					this.balance -= amount;
			}				
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public static int getAccNumber() {
		return accNumber;
	}

	public static void setAccNumber(int accNumber) {
		Account.accNumber = accNumber;
	}

	@Override
	public String toString() {
		return "Account [Label=" + label + ", Balance=" + balance + ", accountNumber=" + accountNumber + ", client="
				+ client + "]";
	}
	

	public int compareTo(Account account) {
		
		return (Double.valueOf(this.balance)).compareTo(Double.valueOf(account.balance));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


