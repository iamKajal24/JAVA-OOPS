package OOPSInterview;
class Candidate6 {
    // data:data Members :Instance Variable
    int StudentId;
    String StudentName;
    String StudentCity;

    public Candidate6() {
        System.out.println("Creating Object : non-p");
    }

    public Candidate6(int st) {
        System.out.println("Parameterized Constructor : (int)");
    }
    
    public Candidate6(String n ,int i, String c) {
    	StudentId =i;
    	StudentName=n;
    	StudentCity=c;
    }

    // Behavior : Member Method: Method (Function)
    public void study() {
        System.out.println(StudentName + " is Studying ");
    }

    public void ShowFullDetails() {
        System.out.println("My Name is " + StudentName);
        System.out.println("My id is " + StudentId);
        System.out.println("My city is " + StudentCity);
    }
}
public class ConstructorOverloading1 {

	public static void main(String[] args) {
		Candidate6 st1 = new Candidate6(); // Initialize st1 object
        st1.StudentName = "Kajal";
        st1.StudentId = 346;
        st1.StudentCity = "Haridwar";

        st1.study();
        st1.ShowFullDetails();

        System.out.println("*************************************************************");

        Candidate6 st2 = new Candidate6(11); // Initialize st2 object

        st2.StudentName = "Riya";
        st2.StudentId = 348;
        st2.StudentCity = "Delhi";

        st2.study();
        st2.ShowFullDetails();
        
        System.out.println("*************************************************************");

        Candidate6 st3 = new Candidate6("Khushi",657,"Dehradun"); // Initialize st2 object
        st3.study();
        st3.ShowFullDetails();
	}

}
