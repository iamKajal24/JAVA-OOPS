package OOPS;

class Employee {
	int rollno;
	String name;
	String Add;

	void insertRecord(int r, String n, String a) {
		rollno = r;
		name = n;
		Add = a;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name + " " + Add);
	}
}

public class ObjectClassthroughMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee sc1 = new Employee();
		Employee sc2 = new Employee();

		sc1.insertRecord(101, "kajal", "Haridwar");
		sc2.insertRecord(102, "Riya", "Delhi");
		sc1.displayInformation();
		sc2.displayInformation();

	}

}
