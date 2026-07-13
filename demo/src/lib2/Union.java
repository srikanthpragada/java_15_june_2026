package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class Union {

	public static void main(String[] args) throws IOException {

		var p1 = Path.of("names.txt");
		var p2 = Path.of("newnames.txt");

		var first_lines = Files.readAllLines(p1);
		var second_lines = Files.readAllLines(p2);

		first_lines.addAll(second_lines);

		var unique_lines = new TreeSet<String>(first_lines);
		for (var line : unique_lines)
			System.out.println(line);

	}

}
