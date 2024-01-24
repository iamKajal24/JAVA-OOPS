package OOPS;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class RealExampleOfJavaMethodOverriding {

	public static void main(String[] args) {
		SBI Sb = new SBI();
		ICICI IC = new ICICI();
		AXIS AX = new AXIS();

		System.out.println("SBI Rate of Interest : " + Sb.getRateOfInterest());
		System.out.println("ICICI Rate of Interest : " + IC.getRateOfInterest());
		System.out.println("AXIS Rate of Interest : " + AX.getRateOfInterest());
	}
}
