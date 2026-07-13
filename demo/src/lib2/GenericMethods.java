package lib2;

public class GenericMethods {

	public static void print(Integer[] a) {
		for (var v : a)
			System.out.println(v);
	}

	public static void print(String[] a) {
		for (var v : a)
			System.out.println(v);
	}

	// Generic Method
	public static <T> void gprint(T[] a) {
		for (T v : a)
			System.out.println(v);
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		print(a);

		String[] names = { "C", "C++", "C#", "Java", "Python" };
		print(names);

		gprint(names);
		gprint(a);

	}

}
