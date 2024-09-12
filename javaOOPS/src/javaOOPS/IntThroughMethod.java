package javaOOPS;

class Employee {
	int id;
	String name;
	float salary;

	void insertRecord(int i, String n, float s) 
	{
		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class IntThroughMethod {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.insertRecord(101, "kajal", 50000);
		em.display();

		Employee em1 = new Employee();
		em1.insertRecord(106, "Ria", 55060);
		em1.display();
	}
}
