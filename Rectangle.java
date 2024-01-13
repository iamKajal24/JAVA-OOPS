package OOPS;

class Rect {
	int length;
	int width;

	void InsertRecord(int l, int w) {
		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println(length * width);
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();
		r1.InsertRecord(115, 56);
		r1.calculateArea();

		Rect r2 = new Rect();
		r2.InsertRecord(23, 87);
		r2.calculateArea();
	}
}
