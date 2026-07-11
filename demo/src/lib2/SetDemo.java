package lib2;

import java.util.TreeSet;

class Circle implements Comparable<Circle> {
	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public String toString() {
		return this.radius + "";
	}
	public boolean equals(Object obj) {
		var other = (Circle) obj;
		return this.radius == other.radius;
	}
	public int hashCode() {
		return this.radius;
	}
	@Override
	public int compareTo(Circle other) {
		return  this.radius  - other.radius;
	}
}

public class SetDemo {
	public static void main(String[] args) {
		var circles = new TreeSet<Circle>();

		circles.add(new Circle(10));
		circles.add(new Circle(20));
		circles.add(new Circle(10));
		circles.add(new Circle(15));

		for (var c : circles) {
			System.out.println(c);
			//System.out.println(c.hashCode());
		}
	}
}
