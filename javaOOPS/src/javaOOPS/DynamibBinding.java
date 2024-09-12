package javaOOPS;

class Animal45 {
	void eat() {
		System.out.println("animal is eating.....");
	}
}

class Tiger extends Animal45 {
	void eat() {
		System.out.println("Tiger is eating...");
	}
}

public class DynamibBinding {

	public static void main(String[] args) {
		Animal45 A = new Tiger();
		A.eat();
	}
}
