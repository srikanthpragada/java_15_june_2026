package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter a number :");
		 int num = s.nextInt(); // read int from keyboard
		 
		 int square = num * num;
		 System.out.printf("Square of %d is %d", num, square);
	}
}
