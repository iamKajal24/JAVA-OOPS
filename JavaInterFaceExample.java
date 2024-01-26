package OOPS;

interface printable11 {
	void print();
}

class A2411 implements printable11 {
	public void print() {
		System.out.println("Hello");
	}
}

public class JavaInterFaceExample {

	public static void main(String[] args) {
		printable11 P = new A2411();
		P.print();
	}
}
