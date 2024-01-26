package OOPS;

interface Drawable78 {
	void draw();

	default void msg() {
		System.out.println("default metho d");
	}
}

class rectangle implements Drawable78 {
	public void draw() {
		System.out.println("drwaing rectangle");
	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		Drawable78 D = new rectangle();
		D.draw();
		D.msg();
	}
}
