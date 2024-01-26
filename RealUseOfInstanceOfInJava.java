package OOPS;

interface Printable {

}

class A24 implements Printable {
	public void a() {
		System.out.println("a method");
	}
}

class B24 implements Printable {
	public void b() {
		System.out.println("b method");
	}
}

class call {
	void invoke(Printable p) {
		if (p instanceof A24) {
			A24 a = (A24) p;
			a.a();
		}
		if (p instanceof B24) {
			B24 b = (B24) p;
			b.b();
		}
	}
}

public class RealUseOfInstanceOfInJava {

	public static void main(String[] args) {
		Printable p = new B24();
		call c = new call();
		c.invoke(p);

	}
}
