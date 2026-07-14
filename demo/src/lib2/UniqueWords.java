package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class UniqueWords {
	public static void main(String[] args) throws IOException {
		var p = Path.of("story.txt");
		var contents = Files.readString(p);

		var re = Pattern.compile("\\W+");
		var words = re.split(contents.toLowerCase());

		var uniqueWords = new TreeSet<String>(Arrays.asList(words));

		for (var w : uniqueWords)
			System.out.println(w);
	}
}
