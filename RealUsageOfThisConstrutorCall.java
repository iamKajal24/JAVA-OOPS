package OOPS;

class student15 {
	int rollno;
	String name;
	String add;
	float fee;

	student15(int rollno, String name, String add) {
		this.rollno = rollno;
		this.name = name;
		this.add = add;
	}

	student15(int rollno, String name, String add, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.add = add;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + add + " " + fee);
	}

}

public class RealUsageOfThisConstrutorCall {

	public static void main(String[] args) {

		student15 s1 = new student15(111, "kajal", "Haridwar");
		student15 s2 = new student15(112, "Riya", "Dehradun", 189999);

		s1.display();
		s2.display();
		
		// TODO Auto-generated method stub

	}

}
