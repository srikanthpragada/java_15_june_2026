package lib1;

import java.time.LocalDate;
import java.time.Period;

public class STAge {

	public static void main(String[] args) {
		LocalDate sd = LocalDate.of(1998, 10, 24);
		LocalDate cd = LocalDate.now();
		
		var p = Period.between(sd, cd);
		
		System.out.printf("Years %d, Months %d, Days %d",
				  p.getYears(), p.getMonths(), p.getDays());
	}

}
