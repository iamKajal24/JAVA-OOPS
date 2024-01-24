package OOPS;

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle {
	@Override
	void run() {
		System.out.println("Car is running");
	}
}

public class UnderstandingTheProblemWithMethodOverriding {
	public static void main(String[] args) {
		Car obj = new Car();
		obj.run();

		Vehicle V = new Vehicle();
		V.run();
	}
}
