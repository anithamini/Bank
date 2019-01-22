package com.bank.Sbi;


import java.util.Scanner;

public class Account {
	private static int id;
	public static int balance = 0;

	static // scanner
	Scanner input = new Scanner(System.in);

//declare stuff
	public Account(int customerId, int accountBalance) {
		id = customerId;
		balance = accountBalance;
		//System.out.println("Account@@@@@@@@@@@@@@@" + id);
	}

//method to set id
	public void setId(int id) {
		this.id = id;
	}

//method to get id
	public static int getId() {
		return id;
	}

//method to get balance
	public static int getBalance() {
		return balance;
	}

//method to deposit
	public static int deposit(int depositAmount) {
		System.out.println("********deposit:**************");
		//depositAmount = input.nextInt();
		if (depositAmount < 0) {
			System.out.print("Invalid Amount!");
		}
		balance = balance + depositAmount;
		return balance;
	}

//method to withdraw
	public static int withdraw(int withdrawAmount) {
		System.out.println("Your Balance is: " + balance);
		System.out.println("**********withdraw:****************** ");
		//withdrawAmount = input.nextInt();
		if (withdrawAmount > balance) {
			System.out.println("You do not have a sufficient balance to withdraw this amount!");
			return 1;
		}
		if (withdrawAmount < 0) {
			System.out.println("Invalid Amount!");
			return 1;
		}
		balance = balance - withdrawAmount;
		return balance;

	}
}