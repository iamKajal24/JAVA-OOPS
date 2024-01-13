package OOPS;

class student5 {
	int rollno;
	String name;
	String add;
	int age;

	student5(int i, String n) {
		rollno = i;
		name = n;
	}

	student5(int i, String n, String a) {
		rollno = i;
		name = n;
		add = a;
	}

	student5(int i, String n, String a, int ag) {
		rollno = i;
		name = n;
		add = a;
		age = ag;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + add + " " + age);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student5 s1 = new student5(101, "kajal");
		student5 s2 = new student5(101, "Goldy", "Laldhang");
		student5 s3 = new student5(101, "Hardeep", "Haridwar", 24);

		s1.display();
		s2.display();
		s3.display();
	}

}
