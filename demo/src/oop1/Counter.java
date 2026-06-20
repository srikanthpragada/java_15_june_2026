package oop1;
 
public class Counter {
	// instance variables
	private int value; 
	
	// constructor overloading
	public Counter() {
		System.out.println("Default Constructor");
	}
	
	public Counter(int v) {
		value = v;
	}

	// methods overloading 
	public void inc() {
		value++;
	}
	
	public void inc(int step) {
		value += step;
	}

	public void dec() {
		value--;
	}
	
	public int getValue() {
		return value;
	}
}
