package OOPS;

class Animal24 {
	String Color = "white";
}

class Dogs extends Animal24 {
	String Color = "Black";

	void printColor() {
		System.out.println(Color);
		System.out.println(Color);
	}
}

public class SuperisUsedToReferImmediateParentClassInstanceVariable {

	public static void main(String[] args) {
		Dogs D = new Dogs();
		D.printColor();
	}
}
