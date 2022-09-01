package com.bank;

import java.util.Date;


public abstract class Flow {
	private String comment;
	private String identifier;
	private double amount;
	private int targetAccountNumber;
	private boolean effect;
	private Date dateFlow;
	
	
	
	// Constructor :
	
	public Flow(double amount, int targetAccountNumber) {
		this.amount = amount;
		this.targetAccountNumber = targetAccountNumber;
		Date date = new Date();
		this.dateFlow = date;
	}
	
	
	

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTargetAccountNumber() {
		return targetAccountNumber;
	}
	public void setTargetAccountNumber(int targetAccountNumber) {
		this.targetAccountNumber = targetAccountNumber;
	}
	public boolean isEffect() {
		return effect;
	}
	public void setEffect(boolean effect) {
		this.effect = effect;
	}
	public Date getDateFlow() {
		return dateFlow;
	}
	public void setDateFlow(Date dateFlow) {
		this.dateFlow = dateFlow;
	}
	
	
	
	
	
	
}
