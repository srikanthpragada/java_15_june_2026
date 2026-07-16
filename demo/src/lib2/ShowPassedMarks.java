package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShowPassedMarks {

	public static void main(String[] args) throws IOException {
		var p = Path.of("c:\\classroom\\jun15j\\marks.txt");
		var s = Files.lines(p);
 
		System.out.println("Passed Marks");
		s.mapToInt( v -> Integer.parseInt(v))  // ToIntFunction (int applyAsInt(T))
		 .filter(v -> v >= 50)  // IntPredicate (boolean test(T))
		 .forEach(System.out::println);

		s.close();
		
		s = Files.lines(p);
		
		System.out.println("Failed Marks");
		s.mapToInt( v -> Integer.parseInt(v))  // ToIntFunction (int applyAsInt(T))
		 .filter(v -> v < 50)  // IntPredicate (boolean test(T))
		 .forEach(System.out::println); // Consumer (void accept(T))
		
		s.close();
	}

}
