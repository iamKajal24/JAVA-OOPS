package javaOOPS;

class Animal24 {
	void eat24() {
		System.out.println("eaing ");
	}
}

class Dog24 extends Animal24 {
	void eat24() {
		System.out.println("eating bread.....");
	}
}

class Cat24 extends Animal24 {
	void eat24() {
		System.out.println("eating chicken....");
	}
}

class Lion extends Animal24 {
	void eat24() {
		System.out.println("eating meat .....");
	}
}

public class JavaRuntimePolymorphismAnimal {

	public static void main(String[] args) {
		Animal24 A;

		A = new Dog24();
		A.eat24();

		A = new Cat24();
		A.eat24();

		A = new Lion();
		A.eat24();
	}
}
