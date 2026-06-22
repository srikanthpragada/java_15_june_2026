package oop1;
 
public class Counter {
	// instance variables
	private int value; 
	
	// constructor overloading
	public Counter() {
		System.out.println("Default Constructor");
	}
	
	public Counter(int value) {
		this.value = value;
	}

	// methods overloading 
	public void inc() {
		this.value++;
	}
	
	public void inc(int step) {
		this.value += step;
	}

	public void dec() {
		this.value--;
	}
	
	public int getValue() {
		return this.value;
	}
}
