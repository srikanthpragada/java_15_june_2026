package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathDemo {

	public static void main(String[] args) throws IOException {
		 var p = Path.of("marks.dat");
		 
		 System.out.println(Files.exists(p));
		 System.out.println(Files.size(p));
		 
		 // Print contents of names.txt
		 var contents = Files.readString(Path.of("names.txt"));
		 System.out.println(contents);
	}

}
