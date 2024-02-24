package OOPSInterview;

class Candidate2424 {
    // data:data Members :Instance Variable
    int StudentId;
    String StudentName;
    String StudentCity;

    public Candidate2424() {
        System.out.println("Creating Object : non-p");
    }

    public Candidate2424(int st) {
        System.out.println("Parameterized Constructor : (int)");
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

public class ConstructorOverloading {

    public static void main(String[] args) {
        Candidate2424 st1 = new Candidate2424(); // Initialize st1 object
        st1.StudentName = "Kajal";
        st1.StudentId = 346;
        st1.StudentCity = "Haridwar";

        st1.study();
        st1.ShowFullDetails();

        System.out.println("*************************************************************");

        Candidate2424 st2 = new Candidate2424(11); // Initialize st2 object

        st2.StudentName = "Riya";
        st2.StudentId = 348;
        st2.StudentCity = "Delhi";

        st2.study();
        st2.ShowFullDetails();
    }
}
