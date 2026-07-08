package lib2;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 var f1 = new File("marks.dat");
		 System.out.println(f1.exists());
		 
		 System.out.println(f1.getAbsolutePath());

	}

}
