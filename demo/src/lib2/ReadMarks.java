package lib2;

import java.io.EOFException;
import java.io.RandomAccessFile;

public class ReadMarks {

	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("marks.dat", "r");

		try {
			while (true) {
				var marks = raf.readByte();
				System.out.println(marks);
			}
		} catch (EOFException ex) {
            
		}

		raf.close();
	}

}
