package OOPS;

interface Drawable32 {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle22 implements Drawable32 {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

public class JavaStaticMethodInInterface {

	public static void main(String[] args) {
		Drawable32 D = new Rectangle22();
		D.draw();
		System.out.println(Drawable32.cube(3));
	}
}
