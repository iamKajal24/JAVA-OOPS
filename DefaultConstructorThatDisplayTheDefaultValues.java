package OOPS;

class Student1 {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
}

public class DefaultConstructorThatDisplayTheDefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(), s1 = new Student1();
		s.display();
		s1.display();

	}

}
