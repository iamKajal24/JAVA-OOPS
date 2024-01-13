package OOPS;

class C {
	C() {
		this(5);
		System.out.println("hello a");
	}

	C(int x) {
		System.out.println(x);
	}
}

public class CallingPerameterizedConstructorFromDefaultConstrutor {

	public static void main(String[] args) {
		C c = new C();
	}
}
