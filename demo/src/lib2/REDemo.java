package lib2;

import java.util.regex.Pattern;

public class REDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z]+");
		String[] items = p.split("one 9 two,three; four - five");
		for (String s : items)
			System.out.println(s);

	}

}
