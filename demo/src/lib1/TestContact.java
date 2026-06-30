package lib1;

record Contact(String name, String email) {
	
}


public class TestContact {

	public static void main(String[] args) {
		 var c1 = new Contact("Joe", "joe@gmail.com");
		 var c2 = new Contact("Joe", "joe@gmail.com");
		 var c3 = new Contact("Kim", "kim@gmail.com");
		 
		 
		 System.out.println(c1.name());
		 System.out.println(c1);
		 System.out.println(c1.equals(c2));
	}

}
