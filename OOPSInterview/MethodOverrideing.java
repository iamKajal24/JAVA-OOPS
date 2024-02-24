package OOPSInterview;
class Parent{
	//method overridden
	public void m1() {
		System.out.println("i AM m1() of Parent");
	}
	
}
class child extends Parent{
	//method overrding method
	public void m1() {
		System.out.println("i AM m1() of child");
	}
}
public class MethodOverrideing {
	public static void main(String [] args) {
		child c = new child();
		c.m1();
	}
}
