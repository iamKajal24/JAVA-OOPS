package OOPS;

class student7 {
	int rollno;
	String name;

	student7(int r, String n) {
		rollno = r;
		name = n;
	}

	student7() {
	}

	void display() {
		System.out.println(rollno + " " + name);
	}
}

public class CopyingValuesWithoutConstructor {

	public static void main(String[] args) {
		student7 s1 = new student7(111, "Hardeep");
		s1.display();

		student7 s2 = new student7();
		s2.rollno = s1.rollno;
		s2.name = s1.name;
		s2.display();

	}
}
