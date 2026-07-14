package lib2;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class ComparePersons implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
}

public class TestPerson {
	public static void main(String[] args) {
		var people = new TreeSet<Person>(new ComparePersons());
		people.add(new Person("Jack", 25));
		people.add(new Person("Andy", 23));
		people.add(new Person("Steve", 27));

		for (var p : people)
			System.out.printf("%s - %d\n", p.getName(), p.getAge());

	}

}
