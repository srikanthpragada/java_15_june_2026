package oop2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		int n = Integer.parseInt("A123"); // unchecked exception
		
//		try {
//			var fr = new FileReader("names.txt"); // checked exception
//		} catch (FileNotFoundException ex) {
//
//		}
		
		var fr = new FileReader("names.txt"); // checked exception

	}

}
