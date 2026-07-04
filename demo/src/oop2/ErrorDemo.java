package oop2;

public class ErrorDemo {

	public static void main(String[] args) {
		int a = 100;
		String num = "0";

		try {
			int c = a / Integer.parseInt(num);
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero!");
		} catch (Exception ex) {
			System.out.println("Error:" + ex.getMessage());
		}

		System.out.println("The End!");
	}

}
