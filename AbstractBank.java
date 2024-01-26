package OOPS;

abstract class BANK24 {
	abstract int getRateOfInterest();
}

class SBI1 extends BANK24 {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB1 extends BANK24 {
	int getRateOfInterest() {
		return 8;
	}
}

public class AbstractBank {

	public static void main(String[] args) {
		BANK24 B;
		B = new SBI1();
		System.out.println("Rate of Interest is : " + B.getRateOfInterest() + " % ");

		B = new PNB1();
		System.out.println("Rate of Interest is : " + B.getRateOfInterest() + " % ");
	}
}
