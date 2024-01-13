package OOPS;

class B {
	B() {
		System.out.println("Hello a");
	}

	B(int x) {
		this();
		System.out.println(x);
	}
}

public class ThisToInvikeCurrentClassConstructor {

	public static void main(String[] args) {
		B b1 = new B(10);
	}

}
