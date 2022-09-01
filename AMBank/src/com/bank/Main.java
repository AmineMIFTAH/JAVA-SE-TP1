package com.bank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		Main main = new Main();
		
		List<Client> clients = new ArrayList<>();
		
		clients = main.loadClients(2);
		main.displayClients(clients);
		
		
		List<Account> accounts = new ArrayList<>();
		
		
		
		accounts = main.loadAccounts(clients);
		//m.displayAccounts(accounts);
		for(Account account : accounts) {
			if(account instanceof SavingsAccount)
				System.out.println(account);
		}
		
		// Adaptation of the table of accounts
		Hashtable<Integer, Account> HashMapOfAccounts = main.loadHashTable(accounts);
		main.displayHashTableOfAccounts(HashMapOfAccounts);
		
		
		// Flows
		List<Flow> flows = new ArrayList<>();
		
		
			
	}	
		public List<Client> loadClients(int numberClients){
			List<Client> clients = new ArrayList<>();
			
			for(int i = 1 ; i<=numberClients; i++) {
				System.out.print("Enter name of client " + i + " : ");
				Scanner scName = new Scanner(System.in);
				String name = scName.nextLine();
				System.out.print("Enter first name of client " + i + " : ");
				Scanner scFirstName = new Scanner(System.in);
				String firstName = scFirstName.nextLine();
				
				Client client =  new Client(name, firstName);
				clients.add(client);
			}
			return clients;
		}
		
		public void displayClients(List<Client> clients) {
			System.out.println("--------- Display Clients -------");
			clients.stream().forEach(System.out::println);
		}
	
	
		public List<Account> loadAccounts(List<Client> clients){
			List<Account> accounts = new ArrayList<>();
			
			for(Client client : clients) {
				Account currentAccount = new CurrentAccount(client.getName(), client, 0);
				Account savingsAccount = new SavingsAccount(client.getName(), client, 50);
				accounts.add(currentAccount);
				accounts.add(savingsAccount);
			
			}
			return accounts;
		}
		
		
		public void displayAccounts(List<Account> accounts) {
			System.out.println("------------- display Accounts -----------");
			accounts.stream().forEach(System.out::println);
		}		
		
		
		public Hashtable<Integer, Account> loadHashTable(List<Account> accounts) {
			
			Hashtable<Integer, Account> hashMapOfAccounts = new Hashtable<>();
			
			for(Account account : accounts) 
				hashMapOfAccounts.put(account.getAccountNumber(), account);
			
			return hashMapOfAccounts;
		}
		
		
		public void displayHashTableOfAccounts(Hashtable<Integer, Account> hashTableOfAccounts) {
			System.out.println("------- Sorted accounts by balance ---------");
			
			Map<Integer, Account> hashTableOfAccountsSorted =  
					hashTableOfAccounts
					.entrySet()					
					.stream()
					.sorted(Map.Entry.comparingByValue())
					.collect( Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
							(e1, e2) -> e1, LinkedHashMap::new)); 
			    	
			
	    	for(Account account : hashTableOfAccountsSorted.values())
	    		System.out.println(account);
		}
		
		
		public List<Flow> loadFlows(){
			List<Flow> flows = new ArrayList<>();
			
			Flow debit = new Debit(50, 1);
			flows.add(debit);
			
			return flows;
			
		}
		

	
}
