package OOPSInterview;

class emp {
	int empId;
	String empName;
	String empDept;

	public emp(int id, String Name, String dept) {
		this.empId = id;
		this.empName = Name;
		this.empDept = dept;
	}

	public void study() {
		System.out.println(empName + " is Working at Ericsson ");
	}

	public void showfullDetails() {
		System.out.println("This is id " + empId);
		System.out.println("This is " + empName);
		System.out.println("Employee department " + empDept);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		emp em = new emp(101, "kajal", "Java Developer");
		em.study();
		em.showfullDetails();

	}

}
