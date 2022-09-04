package com.bank;

import java.time.LocalDate;


public abstract class Flow {
	private String comment;
	private String identifier;
	private double amount;
	private int targetAccountNumber;
	private boolean effect;
	private LocalDate dateFlow;
	
	
	
	// Constructor :
	
	public Flow(double amount, int targetAccountNumber) {
		this.amount = amount;
		this.targetAccountNumber = targetAccountNumber;
		this.dateFlow = LocalDate.now();
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
	public LocalDate getDateFlow() {
		return dateFlow;
	}
	public void setDateFlow(LocalDate dateFlow) {
		this.dateFlow = dateFlow;
	}
	
	
	
	
	
	
}
