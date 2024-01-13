package OOPS;
class Employee24{
	float salary =20000;
}
class programmer extends Employee24{
   int bouns = 5000;
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      programmer p =new programmer();
      System.out.println("Programmer salary is : " + p.salary);
      System.out.println("Bouns of Programmer salary is : " + p.bouns);
	}

}
