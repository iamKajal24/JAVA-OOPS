package OOPS;
//interface declaration : by first User

interface Drawable {
	void draw();
}

// interface implementation by second user

class Rectangle89 implements Drawable {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle89 implements Drawable {
	public void draw() {
		System.out.println("Drwaing Circle");
	}
}

//Using Interface by third User
public class InterFaceDrawable {

	public static void main(String[] args) {
		Drawable D = new Rectangle89();
		D.draw();
	}
}
