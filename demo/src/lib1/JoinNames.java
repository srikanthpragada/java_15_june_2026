package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinNames {

	public static void main(String[] args) {

		var sj = new StringJoiner(",");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();

			if (name.toLowerCase().equals("end"))
				break;

			sj.add(name);
		}

		s.close();

		System.out.println(sj);

	}

}
