package OOPSInterview;

class Candidate06 {
    // data:data Members :Instance Variable
    int StudentId;
    String StudentName;
    String StudentCity;

    public Candidate06() {
        System.out.println("Creating Object : non-p");
    }    
    public Candidate06(String n ,int i, String c) {
    	StudentId =i;
    	StudentName=n;
    	StudentCity=c;
    }

    // Behavior : Member Method: Method (Function)
    public void study() {
        System.out.println(StudentName + " is Studying ");
    }
    public void study(float f) {
    	System.out.println("method overloading : ");
    }

    public void ShowFullDetails() {
        System.out.println("My Name is " + StudentName);
        System.out.println("My id is " + StudentId);
        System.out.println("My city is " + StudentCity);
    }
}

public class MethodOverload {

	public static void main(String[] args) {
		Candidate06 st1 = new Candidate06(); // Initialize st1 object
		st1.StudentName = "Kajal";
		st1.StudentId = 346;
		st1.StudentCity = "Haridwar";

		st1.study();
		st1.ShowFullDetails();
	}

}
