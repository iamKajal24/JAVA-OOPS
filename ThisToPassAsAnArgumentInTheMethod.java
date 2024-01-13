package OOPS;

class s2 {
	void m(s2 obj) {
		System.out.println("Method is invoked");
	}

	void p() {
		m(this);
	}
}

public class ThisToPassAsAnArgumentInTheMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s2 s1 = new s2();
		s1.p();
	}
}
