package OOPS;

class AAA {
	AAA get() {
		return this;
	}
}

class B1 extends AAA {
	B1 get() {
		return this;
	}

	void message() {
		System.out.println("Welcome to conviant return Type");
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		new B1().get().message();
	}
}
