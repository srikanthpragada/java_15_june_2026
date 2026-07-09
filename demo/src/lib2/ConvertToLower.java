package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertToLower {

	public static void main(String[] args) {
		var source = Path.of("names.txt");
		var target = Path.of("lower_names.txt");

		try {
			var source_contents = Files.readString(source);
			try {
				Files.writeString(target, source_contents.toLowerCase());
				System.out.println("Copied Successfully!");
			} catch (Exception ex) {
				System.out.println("Sorry! Cannot write to target file!");
			}

		} catch (Exception ex) {
			System.out.println("Sorry! Source file not found!");
		}

	}

}
