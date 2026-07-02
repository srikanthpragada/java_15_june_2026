package oop2;

class MyCounter implements Counter {
	private int value = 1;

	@Override
	public void inc() {
		this.value++;
	}

	@Override
	public void dec() {
		this.value--;
	}

	@Override
	public int getValue() {
		return this.value;
	}

}

public class TestCounter {

	public static void main(String[] args) {
		MyCounter c1 = new MyCounter();
		c1.inc();
		

		Counter c2 = new MyCounter();
		c2.inc();
		System.out.println(c2.getValue());

	}

}
