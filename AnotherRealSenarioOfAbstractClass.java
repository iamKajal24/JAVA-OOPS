package OOPS;

interface AI {
	void a();

	void b();

	void c();

	void d();
}

abstract class B43 implements AI {
	public void c() {
		System.out.println("I am RP ");
	}
}

class M extends B43 {
	public void a() {
		System.out.println("I am Kajal");
	}

	public void b() {
		System.out.println("I am Riya");
	}

	public void d() {
		System.out.println("I am KP");
	}
}

public class AnotherRealSenarioOfAbstractClass {

	public static void main(String[] args) {
       AI a = new M();
       a.a();
       a.b();
       a.c();
       a.d();
	}

}
