package lib2;

import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ShowMarks {

	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("marks.dat", "r");
		var s = new Scanner(System.in);
		while (true) {
			System.out.print("Enter your rollno [0 to stop]:");
			var rollno = s.nextInt();
			if (rollno == 0)
				break;

			var pos = rollno - 1;
			raf.seek(pos); // go to that position
			try {
				var marks = raf.readByte();
				System.out.println(marks);
			} catch (Exception ex) {
				System.out.println("Invalid Rollno!");
			}

		} // while

		raf.close();
	}

}
