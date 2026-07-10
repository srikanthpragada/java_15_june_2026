package lib2;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 
		 al.add("Abc");
		 al.add(10);   // 10 -> Integer  
		 al.add("Xyz");
		 
		 String s = (String) al.get(0);
		 
		 var names = new ArrayList<String>();
		 names.add("Abc");
		 String name = names.get(0);
		 
		 
		 

	}

}
