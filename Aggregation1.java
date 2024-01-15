package OOPS;

class Operation {
	int square(int n) {
		return n * n;
	}
}

class circle {
	Operation op;
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsqaure = op.square(radius);
		return pi * rsqaure;
	}
}

public class Aggregation1 {

	public static void main(String[] args) {
		circle c = new circle();
		double res = c.area(5);
		System.out.println("result is : " + res);
	}
}