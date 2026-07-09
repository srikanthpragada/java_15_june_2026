package lib2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		var al = new ArrayList<String>();

		al.add("Java");
		al.add("Python");

		al.remove("Java");
		//al.remove(0);

		al.add(0, "JavaScript");

		for (var n : al) {
			System.out.println(n);
		}
		
	}

}
