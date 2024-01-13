package OOPS;

class EmployeeX {
	int id;
	String name;
	float Salary;

	void insertRecord(int i, String n, float S) {
		id = i;
		name = n;
		Salary = S;
	}

	void display() {
		System.out.println(id + " " + name + " " + Salary);
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeX em = new EmployeeX();

		em.insertRecord(101, "kajal", 50000);
		em.display();

		EmployeeX em1 = new EmployeeX();
		em1.insertRecord(101, "Riya", 89900);
		em1.display();

	}
}
