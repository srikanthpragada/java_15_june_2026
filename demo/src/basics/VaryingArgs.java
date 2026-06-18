package basics;

public class VaryingArgs {

	public static void printHello(String name) {
		System.out.println("Hello " + name);
	}

	public static void greetAll(String... names) {
         for(String name : names)
        	 System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		printHello("James");
		greetAll("James", "Andy", "Kevin");
		greetAll("Gary", "Jason");
	}

}
