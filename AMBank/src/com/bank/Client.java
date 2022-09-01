package com.bank;

public class Client{

	private String name;
	private String firstName;
	private int clientNumber;
	
	static int clNumber = 0;
	
	public Client(String name, String firstname) {
		Client.clNumber ++;
		this.clientNumber = Client.clNumber;
		this.name = name;
		this.firstName = firstname;
	}
	
	/* Access */
	
	public String getName() {
		return this.name;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	// Mutators
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String toString() {
		return "Im " + this.name + " " + this.firstName + " with number client " + this.clientNumber;
	}


}
