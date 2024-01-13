package OOPS;

class student13 {
	int rollno;
	String name;
	static String Add = "Haridwar";

	student13(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + Add);
	}
}

public class SolutionOfTheAbouveProblembyThisKeyword {

	public static void main(String[] args) {

		student13 s1 = new student13(111, "kajal");
		student13 s2 = new student13(112, "Riya");

		s1.display();
		s2.display();
	}
}
