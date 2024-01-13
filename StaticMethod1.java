package OOPS;

class student10 {
	int rollno;
	String name;
	static String add = "Haridwar";
	static String College = "chinmayDegree";

	static void change() {
		add = "Dehradun";
		College = "USCS";
	}

	student10(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + add + " " + College);
	}
}

public class StaticMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student10.change();

		student10 s1 = new student10(111, "kajal");
		student10 s2 = new student10(112, "Ria");

		s1.display();
		s2.display();
	}

}
