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
	
	// Overriding 
	@Override 
	public int getSalary() {
		return this.salary + this.hra;
	}
}

public class TestEmployees {

	public static void main(String[] args) {
		 Employee e = new Employee("Brian", 60000);
		 Manager m = new Manager("Martin",100000, 30000);

		 System.out.println(e.getName());
		 System.out.println(e.getSalary());
		 
		 System.out.println(m.getName());
		 System.out.println(m.getSalary());
		 
 		 e = m;  // Upcasting 
 		 
 		 //m = e;
		 
		 if(e instanceof Manager)
		      m =  (Manager) e;  // Downcasting 
		 
		 if(e instanceof Manager man) {
			  System.out.println(man.getSalary());
		 }
		       
	}

}
