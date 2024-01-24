package OOPS;
class Honda1{
	final void run() {
		System.out.println("Running......");
	}
}
class Car45 extends Honda1{
	void run() {
		System.out.println("Running safely");
	}
}
public class IsFinalMethodInherited {

	public static void main(String[] args) {
		new Honda1().run();
	}

}
