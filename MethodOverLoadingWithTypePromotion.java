package OOPS;

class Overloading {
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class MethodOverLoadingWithTypePromotion {

	public static void main(String[] args) {

		Overloading ol = new Overloading();
		ol.sum(20, 20);
		ol.sum(20, 20, 20);
	}
}
