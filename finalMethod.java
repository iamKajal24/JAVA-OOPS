package OOPS;
class Car06{
	final void run() {
		System.out.println("running.......");
	}
}
class Honda extends Car06{
	void run() {
		System.out.println("running safely with 100km/h");
	}
}
public class finalMethod {

	public static void main(String[] args) {
		Honda H = new Honda();
		H.run();

	}

}
