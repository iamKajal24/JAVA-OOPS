package OOPS;
class Student17{
	int rollno;
	String name;
	String course;
	float fee;
	
	Student17(int rollno,String name,String Course){
		this.rollno = rollno;
		this.name = name;
		this.course =course;
	}
	Student17(int rollno,String name,String course, float fee){
		this(rollno,name,course);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name +" "+course+" "+fee);
	}
}
public class ReusingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student17 s1 = new Student17(101,"kajal","Java");
        Student17 s2 = new Student17(102,"Riya","Html/Css",100000);
        
        s1.display();
        s2.display();
	}

}
