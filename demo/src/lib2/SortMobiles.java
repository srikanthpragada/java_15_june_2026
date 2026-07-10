package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortMobiles {

	public static void main(String[] args) throws IOException {
		var path = Path.of("mobiles.txt");
		var lines = Files.readAllLines(path);

		var mobiles = new TreeSet<String>();

		for (var line : lines) {
			var parts = line.split(",");
			for (var part : parts)
				mobiles.add(part);
		}

		// print mobiles
		for (var mobile : mobiles)
			System.out.println(mobile);

	}

}
