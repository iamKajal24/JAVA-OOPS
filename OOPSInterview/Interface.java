package OOPSInterview;
public interface Shapee1{
	int i = 34;
	
	void calculator(int r);
}
class circleee implements Shapee1{
	public void calculator(int r) {
		System.out.println("Area of circle is " + (Math.PI*r*r));
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Shapee1 ss = new circleee();
		ss.calculator(5);
	}

}
