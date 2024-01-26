package OOPS;

//creating interface that has 4 methods
interface AB {
	void aa();

	void bb();

	void cc();

	void dd();
}

// creating abstract class that provides the implementation of one method of A interface

abstract class BA implements AB {
	public void cc() {
		System.out.println("Hii, i am c");
	}
}

class MM extends BA {
	public void aa() {
		System.out.println("hello, i am a");
	}

	public void bb() {
		System.out.println("hii, i am b");
	}

	public void dd() {
		System.out.println("hyy, i am d");
	}
}

public class InterFaceAndAbstract {

	public static void main(String[] args) {

		AB a = new MM();
		a.aa();
		a.bb();
		a.cc();
		a.dd();
	}
}
