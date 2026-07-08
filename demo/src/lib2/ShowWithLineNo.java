package lib2;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ShowWithLineNo {

	public static void main(String[] args) throws IOException {

		try (var fr = new FileReader("c:\\classroom\\jun15j\\demo\\src\\lib2\\ReadLines.java"); 
		 	 var lr = new LineNumberReader(fr)) {
			while (true) {
				String line = lr.readLine();
				if (line == null)
					break;

				System.out.printf("%3d : %s\n", lr.getLineNumber(), line);
			}
		} // try

	}
}
