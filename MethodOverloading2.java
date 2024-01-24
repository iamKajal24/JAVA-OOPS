package OOPS;

class Adder2 {
	static int add1(int a, int b) {
		return a + b;
	}

	static double add1(double a, double b) {
		return a + b;
	}
}

public class MethodOverloading2 {

	public static void main(String[] args) {
		System.out.println(Adder2.add1(11, 11));
		System.out.println(Adder2.add1(11.2, 22.3));

	}
}
