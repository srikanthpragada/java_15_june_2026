package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamSortNames {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\jun15j\\names.txt");
		var s = Files.lines(p);
 
		s.sorted()
		 .skip(2)
		 .limit(3)
		 .forEach(System.out::println);
	}

}
