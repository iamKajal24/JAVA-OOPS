package OOPS;

class student195 implements Cloneable {
	int rollno;
	String Name;

	student195(int rollno, String Name) {
		this.rollno = rollno;
		this.Name = Name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ExampleofCloneMethod {

	public static void main(String[] args) {

		try {
			student195 Original = new student195(101, "kajal");
			student195 Copy = (student195) Original.clone();

			System.out.println(Original.rollno + " " + Original.Name);
			System.out.println(Copy.rollno + " " + Copy.Name);
		} catch (CloneNotSupportedException c) {

		}

	}
}
