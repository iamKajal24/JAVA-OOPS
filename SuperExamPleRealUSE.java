package OOPS;

class person {
	int id;
	String name;

	person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Employee111 extends person {
	float salary;

	Employee111(int id, String name, float Salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class SuperExamPleRealUSE {

	public static void main(String[] args) {
		Employee111 em = new Employee111(1, "kajal", 45000f);
		em.display();
	}
}
