package OOPS;

class testRectangle {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void calculation() {
		System.out.println(length * width);
	}
}

public class CreatingMultipleObjectByOneTypeOnly {

	public static void main(String[] args) {
		testRectangle tr = new testRectangle(), tr1 = new testRectangle();
		tr.insert(23, 56);
		tr.calculation();

		tr1.insert(45, 76);
		tr1.calculation();

	}

}
