package OOPS;

//abstract methods 
abstract class Bike11 {
	Bike11() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear Changed");
	}
}

//Creating a child class with inherits Abstract class

class Honda11 extends Bike11 {
	void run() {
		System.out.println("Running Safely");
	}
}

public class AbstractClassHavingConstructorDataMemberAndMethods {

	public static void main(String[] args) {
		Bike11 B = new Honda11();
		B.run();
		B.changeGear();
	}
}
