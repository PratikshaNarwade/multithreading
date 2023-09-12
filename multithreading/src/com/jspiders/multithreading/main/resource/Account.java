package com.jspiders.multithreading.main.resource;

public class Account {

	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int checkBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		System.out.println("Trying to deposit " + amount + " Rs.");
		balance +=amount;
		System.out.println("Amount Deposited Succcessfully!");
		System.out.println("Balance : " +checkBalance());
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Trying to Withdraw " + amount + " Rs.");
		if(balance >= amount) {
		balance -=amount;
		System.out.println("Amount Withdraw Succcessfully!");
		System.out.println("Balance : " +checkBalance());
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}
}
