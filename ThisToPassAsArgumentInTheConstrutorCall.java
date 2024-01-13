package OOPS;

class F {
	E obj;

	F(E obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);
	}
}

class E {
	int data = 10;

	E() {
		F f1 = new F(this);
		f1.display();
	}
}

public class ThisToPassAsArgumentInTheConstrutorCall {

	public static void main(String[] args) {
		E e1 = new E();
	}
}
