package OOPS;

class Student453 {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
}

public class ExampleOfEncapsulationInJava {

	public static void main(String[] args) {
		Student453 S = new Student453();
		S.setName("Kajal");
		System.out.println(S.getName());
	}
}
