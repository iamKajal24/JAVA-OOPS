package javaOOPS;

class Animal11 {
	void eat11() {
		System.out.println("eating ");
	}
}

class Dog11 extends Animal11 {
	void eat11() {
		System.out.println("eating fruits");
	}
}

class BabyDog extends Dog11 {
	void eat11() {
		System.out.println("drinking milk....");
	}
}

public class JavaRuntimePolymorphismWithMultilevelInheritance {

	public static void main(String[] args) {
		Animal11 a1, a2, a3;

		a1 = new Animal11();
		a2 = new Dog11();
		a3 = new BabyDog();

		a1.eat11();
		a2.eat11();
		a3.eat11();

	}
}
