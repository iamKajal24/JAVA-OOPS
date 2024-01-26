package OOPS;

interface printable45 {
	void print();
}

interface showable45 extends printable45 {
	void show();
}

class TestInterface implements printable45, showable45 {
	public void print() {
		System.out.println("Hii, How ARE yOU !");
	}

	public void show() {
		System.out.println("I am Good , What about You..");
	}
}

public class InterfaceInheritance {

	public static void main(String[] args) {
		TestInterface T = new TestInterface();
		T.print();
		T.show();
	}
}
