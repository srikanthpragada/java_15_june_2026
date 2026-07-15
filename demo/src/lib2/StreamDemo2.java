package lib2;

import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		 var s = Stream.of(1,4,2,2,5,8,7);
		 

		 var c = s.distinct() // intermediate
		          .count();   // terminal 
		 
		 System.out.println(c);
		 
	}

}
