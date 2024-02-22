package OOPS1;

//Encapsulation : Data Hiding and Abstraction
class Animal {
	private String name;
	private int age;

	// constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Abstraction : method to make a sound
	public void makeSound() {
		System.out.println("Animals make a Sound : ");
	}

	// polymorphism
//	public String toString() {
//		return "Name : " + name + " , Age :" + age;
//	}
}

//Inheritance : Dog class Inheriting from Animal Class

class Dog extends Animal {
	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	// getter method
	public String getbreed() {
		return breed;
	}

	// setter method
	public void setbreed(String breed) {
		this.breed = breed;
	}

	// polymorphism : Method Overriding
	public void makeSound() {
		System.out.println("Dog braks");
	}

	// polymorphism : method overloading

	public void makeSound(String sound) {
		System.out.println("Dog makes " + sound);
	}
}

public class programOPPS3 {

	public static void main(String[] args) {
		Animal animal = new Animal("Generic Animal", 5);
		Dog dog = new Dog("Buddy", 3, "Labrador");

		System.out.println("Animals Details :");
		System.out.println("Name : " + animal.getName());
		System.out.println("Age : " + animal.getAge());
		animal.makeSound();

		System.out.println("Dog Details : ");
		System.out.println("Name : " + dog.getName());
		System.out.println("Age : " + dog.getAge());
		System.out.println("Breed : " + dog.getbreed());
		dog.makeSound();
		dog.makeSound("woof");
	}
}
