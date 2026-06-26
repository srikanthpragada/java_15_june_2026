package oop1;

enum PaymentModes {
	CASH, UPI, CARD
}

public class EnumDemo {

	public static void main(String[] args) {
		PaymentModes pm;

		pm = PaymentModes.CARD;
		
		if(pm == PaymentModes.CASH) {
			
		}
		
		System.out.println(pm);
	}
}
