package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "Scott", "Dave", "Martin", "Gary", "Kevin" };

		// ARM or try with resource 
		try (var fw = new FileWriter("c:\\classroom\\jun15j\\names.txt")) {
			for (var name : names)
				fw.write(name.toUpperCase() + "\n");
		}

	}
}
