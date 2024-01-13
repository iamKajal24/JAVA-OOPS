package OOPS;

class Emplaoyee {
	int id;
	String name;
	float salary;

	Emplaoyee(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplaoyee ep = new Emplaoyee(101, "kajal", 30000);
		Emplaoyee ep1 = new Emplaoyee(102, "goldy", 46000);
		ep.display();
		ep1.display();

	}

}
