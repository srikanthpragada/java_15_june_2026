package oop2;

class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super("Invalid Transaction Amount. It must be > 0");
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Insufficient Transaction Amount. It must be >= current balance");
	}
}

class Account {
	private int id;
	private String customer;
	private double balance;

	public Account(int id, String customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0)
			throw new InvalidAmountException();

		this.balance += amount;
	}

	public void withdraw(double amount) 
			throws InvalidAmountException, InsufficientBalanceException {
		if (amount <= 0)
			throw new InvalidAmountException();

		if (amount > this.balance)
			throw new InsufficientBalanceException();

		this.balance += amount;
	}
}

public class TestAccount {

	public static void main(String[] args) {
		var a = new Account(1, "Ben", 10000);

		try {
			a.deposit(-1000);
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
