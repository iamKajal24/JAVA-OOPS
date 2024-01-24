package OOPS;

class Animal11 {
	void eat() {
		System.out.println("eating ...");
	}
}
class Dog2 extends Animal11 {
	void eat() {
		System.out.println("eating bread....");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

public class SuperCanBeUsedToInvokeParentClassMethod {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.work();
	}
}
