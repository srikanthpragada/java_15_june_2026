package lib1;

public class Boxing {

	public static void main(String[] args) {
		 Integer obj;
		 
		 obj = 10;   // 10 -> Integer   Auto-boxing 
		 
		 System.out.println(obj.getClass());
		 
		 int v =  obj;  // Auto-unboxing 
		 
		 Object o = "Abc";  // Upcasting 
	}
}
