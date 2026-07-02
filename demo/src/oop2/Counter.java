package oop2;

public interface Counter {
	
	int SIZE = 100; // static and final 
	
	void inc();

	void dec();

	int getValue();
}


// Null interface 
interface Dummy {
	
}