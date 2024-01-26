package OOPS;

interface Printable45{
	void Print();
}
interface showable{
	void show();
}
class A77 implements Printable45,showable{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
}
public class MultipleInheritanceInJavaByInterface {

	public static void main(String[] args) {
		
		A77 obj = new A77();
		obj.print();
		obj.show();

	}

}
