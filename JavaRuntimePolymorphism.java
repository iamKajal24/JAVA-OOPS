package OOPS;

class Bike78 {
	void run34() {
		System.out.println("running.........");
	}
}

class splendor extends Bike78 {
	void run34() {
		System.out.println("running safely with 60km ");
	}
}

public class JavaRuntimePolymorphism {

	public static void main(String[] args) {
		Bike78 b = new splendor();
		b.run34();
	}
}
