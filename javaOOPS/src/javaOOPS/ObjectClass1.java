package javaOOPS;

//Initialize through reference 
class student {
	int id;
	String name;
	String Add;
}

public class ObjectClass1 {

	public static void main(String[] args) {
		student oc = new student();
		oc.id = 101;
		oc.name = "kajal";
		oc.Add = "Jagjeetpur";

		System.out.println(oc.id + " " + oc.name + " " + oc.Add);
	}
}
