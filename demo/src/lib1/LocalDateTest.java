package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		var cd = LocalDate.now();
		var fd = cd.plusDays(10);

		System.out.println(cd);
		System.out.println(fd);

		var sd = LocalDate.of(2026, 1, 1);
		System.out.println(sd);
		
		var ed = LocalDate.parse("2026-02-10");
		System.out.println(ed);
		
		var ct = LocalDateTime.now();
		System.out.println(ct);
		
		

	}

}
