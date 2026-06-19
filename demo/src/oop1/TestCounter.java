package oop1;

public class TestCounter {

	public static void main(String[] args) {
		// Create an object reference
		Counter c;

		// Create an object of Counter class
		c = new Counter();
		
		// calling methods
		c.inc();
		c.inc();

		System.out.println(c.getValue());
	}
}
