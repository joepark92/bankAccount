package com;
import java.util.Random;

public class BankAccount {

	private String accountNum;
	private double checkBal;
	private double saveBal;
	
	private static int totalAccounts = 0;
	private static double totalBalance = 0;
	
	// random account number generator, 10 digits
	private String randomAccNum() {
		String accountNum = "";
		Random num = new Random();
		
		for (int i = 1; i <= 10; i++) {
			accountNum += num.nextInt(10);
		}
		
		return accountNum;
	}
	
	public BankAccount() {
		
		this.accountNum = randomAccNum();
		totalAccounts += 1;
	}
	
	public BankAccount(double checkBal, double saveBal) {
		
		this.accountNum = randomAccNum();
		this.checkBal = checkBal;
		this.saveBal = saveBal;
		
		totalAccounts += 1;
		totalBalance += checkBal + saveBal;
		
	}
	
	public void showAccInfo() {
		
		System.out.println("Account Number: " + accountNum + "\nChecking Account: " + checkBal + "\nSavings Account: " + saveBal);
	}
	
	public double getCheckBal() {
		return checkBal;
	}
	
	public double getSaveBal() {
		return saveBal;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public static double getTotalBalance() {
		return totalBalance;
	}
	
	public void depositChecking(double num) {
		
		checkBal += num;
		totalBalance += num;
	}
	
	public void depositSavings(double num) {
		
		saveBal += num;
		totalBalance += num;
	}
	
	public void withdrawChecking(double num) {
		checkBal -= num;
		totalBalance -= num;
		if (checkBal <= 0) {
			System.out.println("You have an insufficient amount of funds in your Checking Account.");
			checkBal += num;
			totalBalance += num;
			return;
		}
		

	}
	
	public void withdrawSavings(double num) {
		
		if (saveBal <= 0) {
			System.out.println("You have an insufficient amount of funds in your Savings Account.");
			return;
		}
		saveBal -= num;
		totalBalance -= num;
	}
}







