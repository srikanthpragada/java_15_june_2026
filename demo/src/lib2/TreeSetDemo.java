package lib2;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		var names = new TreeSet<String>();

		names.add("Java");
		names.add("JavaScript");
		names.add("C#");
		names.add("Java");
		names.add("Python");

		for (var n : names)
			System.out.println(n);
	}
}
