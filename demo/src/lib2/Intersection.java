package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Intersection {

	public static void main(String[] args) throws IOException {
		 
		var p1 = Path.of("names.txt");
		var p2 = Path.of("newnames.txt");
		
		var first_lines = Files.readAllLines(p1);
		var second_lines = Files.readAllLines(p2);
		
		first_lines.retainAll(second_lines);
		
		for (var line : first_lines)
			System.out.println(line);

	}

}
