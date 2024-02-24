package OOPSInterview;

class Student {
	// data:data Members :Instance Variable
	int StudentId;
	String StudentName;
	String StudentCity;

	// Behavior : Memeber Method: Method (Function)

	public void study() {
		System.out.println(StudentName + " is Studying ");
	}

	public void ShowFullDetails() {
		System.out.println("My Name is " + StudentName);
		System.out.println("My id is " + StudentId);
		System.out.println("My city is " + StudentCity);
	}
}

public class classandObject {

	public static void main(String[] args) {
		Student st1;
		st1 = new Student();
		st1.StudentName = "Kajal";
		st1.StudentId = 346;
		st1.StudentCity = "Haridwar";

		st1.study();
		st1.ShowFullDetails();

		System.out.println("*************************************************************");

		Student st2 = new Student();
		st2.StudentName = "Riya";
		st2.StudentId = 348;
		st2.StudentCity = "Delhi";

		st2.study();
		st2.ShowFullDetails();
	}
}
