package lib2;

import java.util.List;

public class ImmutableColl {

	public static void main(String[] args) {

		var nums = List.of(1, 2, 3, 4, 5);

		System.out.println(nums.get(0));
		System.out.println(nums.getClass());

	}

}
