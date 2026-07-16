package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListFiles {

	public static void main(String[] args) throws IOException {
		 var count = Files.walk(Path.of("c:\\classroom\\jun15j"))
		      .filter(p -> p.toString().endsWith(".java"))
		      .count();
		      //.forEach(System.out::println);
		 
		 System.out.println(count);
		      
		 

	}

}
