package lib2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("c:\\classroom\\jun15j\\names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			String line =  br.readLine();
			if(line == null)
				break;

			System.out.println(line);
		}

		br.close();
		fr.close();
	}
}
