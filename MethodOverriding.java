package OOPS;

class Vehicle1 {
	void run1() {
		System.out.println("Vehicle is running");
	}
}

class Car2 extends Vehicle1 {
	void run1() {
		System.out.println("Car is ruuning safely");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Car2 obj = new Car2(); //creating object
		obj.run1(); //calling function
	}
}
