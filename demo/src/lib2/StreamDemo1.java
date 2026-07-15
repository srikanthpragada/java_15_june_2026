package lib2;

import java.util.function.Consumer;
import java.util.stream.Stream;

class PrintNumber implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class StreamDemo1 {

	public static void main(String[] args) {
		var s = Stream.of(1, 4, 2, 2, 5, 8, 7);

		s.distinct()
		 .sorted()
		 //.forEach(new PrintNumber()); // Consumer
		 .forEach(v -> System.out.println(v));
	}

}
