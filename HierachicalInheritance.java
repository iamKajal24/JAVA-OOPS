package OOPS;

class Animal2 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog3 extends Animal2 {
	void bark() {
		System.out.println("Barking....");
	}
}

class Cat extends Animal2 {
	void meow() {
		System.out.println("Meow...");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();

	}

}
