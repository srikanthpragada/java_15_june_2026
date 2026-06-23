package oop1;

class Employee  {
	private String name;
	protected int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}
}

class Manager extends Employee  {
	private int hra;

	public Manager(String name, int salary, int hra) {
		super(name, salary); // call super class's constructor 
		this.hra = hra;
	}
	
	public int getSalary() {
		return this.salary + this.hra;
	}
	
}

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
