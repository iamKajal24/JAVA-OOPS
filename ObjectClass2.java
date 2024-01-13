package OOPS;

//create multiple objects and store information in it through reference variable.
class Student{
	int id;
	String name;
	String add;
}
public class ObjectClass2 {

	public static void main(String[] args) {
		Student sc1 = new Student();
		Student sc2 = new Student();
		
		sc1.id=101;
		sc1.name="kajal";
		sc1.add="haridwar";
		
		sc2.id=102;
		sc2.name="riya";
		sc2.add="Delhi";
		
		System.out.println(sc1.id+" "+sc1.name+" "+sc1.add);
		System.out.println(sc2.id+" "+sc2.name+" "+sc2.add);

	}

}
