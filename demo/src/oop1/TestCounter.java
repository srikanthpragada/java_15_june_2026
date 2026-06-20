package oop1;

public class TestCounter {
	public static void main(String[] args) {
		// Create an object reference
		Counter c;

		// Create an object of Counter class
		c = new Counter();
		
		// calling methods
		c.inc();
		c.inc(5);

		System.out.println(c.getValue());
		
		Counter c2 = new Counter(100);
		c2.inc();
		System.out.println(c2.getValue());
		
		
	}
}
