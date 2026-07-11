package lib2;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		var students = new HashMap<String, Integer>();
		//var students = new LinkedHashMap<String, Integer>();
		//var students = new TreeMap<String, Integer>();

		students.put("Ben", 90);
		students.put("Joe", 80);
		students.put("Li", 55);
		students.put("Andy", 95);
		students.put("Li", 95);

		for (var name : students.keySet())
			System.out.printf("%s - %d\n", name, students.get(name));
	}
}
