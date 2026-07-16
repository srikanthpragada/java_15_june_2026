package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class ShowPassedMarksV2 {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\jun15j\\marks.txt");

		var passed = new ArrayList<Integer>();
		var failed = new ArrayList<Integer>();

		var s = Files.lines(p);
		s.mapToInt(v -> Integer.parseInt(v)) // ToIntFunction (int applyAsInt(T))
				.forEach(v -> {
					if (v >= 50)
						passed.add(v);
					else
						failed.add(v);
				});

		s.close();

		Collections.sort(passed);
		System.out.println("Passed Marks");
		for (var m : passed)
			System.out.println(m);

		System.out.println("Failed Marks");
		for (var m : failed)
			System.out.println(m);

	}

}
