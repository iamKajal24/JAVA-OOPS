package javaOOPS;

class Area {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void calculation() {
		System.out.println("Rectagle of Area : " + length * width);
	}
}

public class Rectagle {
	public static void main(String[] args) {
		Area a1 = new Area(), a2 = new Area();
		a1.insert(5, 7);
		a1.calculation();

		a2.insert(6, 8);
		a2.calculation();
	}
}
