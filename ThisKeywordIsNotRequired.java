package OOPS;
class student14{
	int rollno;
	String name;
	
	student14(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+" "+name);
	}
}
public class ThisKeywordIsNotRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student14 s1 = new student14(111,"kajal");
      student14 s2 = new student14(112,"Riya");
      
      s1.display();
      s2.display();
	}
}
