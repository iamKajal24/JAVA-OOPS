package OOPS;

abstract class bike24 {
	abstract void run();
}

class Honda242 extends bike24 {
	void run() {
		System.out.println("Running safely");
	}
}

public class AbstractClassThatHasAnAbstractMethod {

	public static void main(String[] args) {
		bike24 b = new Honda242();
		b.run();
	}
}
