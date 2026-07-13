package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class ListChars {

	public static void main(String[] args) throws IOException {
		var p1 = Path.of("names.txt");
		var content = Files.readString(p1);

		var unique_chars = new TreeSet<Character>();

		for (var c : content.toCharArray())
			unique_chars.add(c);

		for (var c : unique_chars)
			System.out.print(c);

	}

}
