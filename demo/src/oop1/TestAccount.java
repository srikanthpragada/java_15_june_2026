package oop1;

class Account {
	// instance variables 
	private int acno;
	private String customer;
	private double balance;
	
	public static int getMinBal() {
		return minbal;
	}
	
	// static variable or class variable 
	private static int minbal = 10000;

	public Account(int acno, String customer, double balance) {
		this.acno = acno;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int acno, String customer) {
		this(acno, customer, 0); // call constructor
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
}

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account(100, "Andy", 50000);
		a.deposit(10000);
		a.withdraw(5000);

		System.out.println(a.getBalance());

		Account a2 = new Account(102, "Mark", 10000);
		a2.deposit(10000);

		System.out.println(a2.getBalance());
	}
}
