package OOPS;

class student8 {
	int id; // instance variable
	String name;
	static String college = "UU";// Static Variable

	// constructor

	student8(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name + " " + college);
	}
}

public class StaticVariable {

	public static void main(String[] args) {

		student8 s1 = new student8(111, "kajal");
		student8 s2 = new student8(121, "goldy");

		s1.display();
		s2.display();
	}

}
