package OOPS;

class student12 {
	int rollno;
	String name;
	float fee;

	student12(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class ThistoReferCurrentClassInstanceVariable {

	public static void main(String[] args) {
		student12 s1 = new student12(111, "kajal", 45000f);
		student12 s2 = new student12(112, "Riya", 56000f);

		s1.display();
		s2.display();
	}

}
