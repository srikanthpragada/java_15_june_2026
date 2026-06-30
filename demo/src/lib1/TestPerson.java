package lib1;

class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person other)
			return this.name.equals(other.name) && this.age == other.age;
		else
			return false;
	}
	
	@Override 
	public int hashCode() {
		return this.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		var p1 = new Person("Andy", 20);
		var p2 = new Person("Kevin", 25);
		var p3 = new Person("Andy", 20);

		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));

		System.out.println(p1.equals("Abc"));

		System.out.println(p1.toString());
		System.out.println(p2); // p2.toString()

	}

}
