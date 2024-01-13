package OOPS;

class student9 {
	int id;
	String name;
	static String college = "UIM";

	// static method to change the value of Static Variable
	static void change() {
		college = "USCS";
	}

	student9(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name + " " + college);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student9.change();// calling change method
		student9 s1 = new student9(111, "kajal");
		student9 s2 = new student9(112, "Riya");
		student9 s3 = new student9(113, "Goldy");
		student9 s4 = new student9(114, "Hardeep");

		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
