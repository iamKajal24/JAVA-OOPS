package OOPSInterview;

class Animal {
	String color = "Blue";

	public void color2() {
		String color2 = "Brown";
		System.out.println("cat Color is " + color2);
	}

	public void eating() {
		System.out.println("Animal Is Eating ");
	}
}

class Dog extends Animal {
	// This class inherits the color field and eating method from Animal
}

class Cat extends Animal {
	// This class inherits the color field and eating method from Animal
}

public class Inheritance {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println("Dog color: " + d1.color); // Accessing color field from Animal
		d1.eating(); // Calling eating method from Animal

		Cat c = new Cat();
		c.color2();
		c.eating();
	}
}