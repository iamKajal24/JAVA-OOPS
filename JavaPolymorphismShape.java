package javaOOPS;

class shape {
	void draw() {
		System.out.println("Drawing......");
	}
}

class Rectangle extends shape {
	void draw() {
		System.out.println("drwaing Rectangle.......");
	}
}

class Circle extends shape {
	void draw() {
		System.out.println("drawing Circle.......");
	}
}

class Triangle extends shape {
	void draw() {
		System.out.println("drawing Triangle......");
	}
}

public class JavaPolymorphismShape {

	public static void main(String[] args) {

		shape s;

		s = new Rectangle();
		s.draw();

		s = new Circle();
		s.draw();

		s = new Triangle();
		s.draw();
	}
}
