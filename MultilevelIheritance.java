package OOPS;

class Animal1 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Barking....");
	}
}

class babyDog extends Dog1 {
	void weep() {
		System.out.println("weeping....");
	}
}

public class MultilevelIheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babyDog bd = new babyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}
}
