package lib2;

import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("c:\\classroom\\jun15j\\names.txt");

		while (true) {
			int ch = fr.read();

			if (ch == -1) // EOF
				break;

			System.out.print((char) ch);
		}

		fr.close();
	}
}
