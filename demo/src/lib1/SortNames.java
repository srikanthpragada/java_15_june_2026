package lib1;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		 String data = "Mark,Jack,Scott,Kevin,Jason";
		 
		 String names [] = data.split(",");

		 Arrays.sort(names);
		 
		 for(String name : names)
			 System.out.println(name);
	}

}
