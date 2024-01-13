package OOPS;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void Bark() {
		System.out.println("Barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.Bark();
		d.eat();

	}

}
