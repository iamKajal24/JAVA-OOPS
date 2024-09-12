package javaOOPS;

class rect {
	int length;
	int width;

	void insert(int len, int wid) {
		length = len;
		width = wid;
	}

	void res() {
		System.out.println("Rectangle of Area :" + length * width);
	}
}

public class RectagleObjClass {

	public static void main(String[] args) {
		rect r1 = new rect();
		r1.insert(23, 45);
		r1.res();
	}
}
