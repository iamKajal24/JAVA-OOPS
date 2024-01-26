package OOPS;

abstract class shape56 {
	abstract void draw56();
}

class Circle56 extends shape56 {
	void draw56() {
		System.out.println("Drawing Circle ");
	}
}

class Rectangle56 extends shape56 {
	void draw56() {
		System.out.println("Drawing Rectangle");
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		shape56 s = new Circle56();
		s.draw56();
	}
}
