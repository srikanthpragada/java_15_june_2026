package lib2;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		var s = new Stack<Integer>();

		// Push 10 random numbers into stack 
		for (int i = 1; i <= 10; i++) {
			int num = (int) (Math.random() * 100);
			s.push(num);
			System.out.println(num);
		}

		// Pop all values from the Stack 
		System.out.println("\nReverse Order\n");
		while (!s.isEmpty())
			System.out.println(s.pop());
	}

}
