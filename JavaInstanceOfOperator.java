package javaOOPS;
class Animal23{
	void eat() {
		System.out.println("Animal Is Eating : ...");
	}
}
class Lion24 extends Animal23{
	void eat() {
		System.out.println("Lion is Eating");
	}
}
public class JavaInstanceOfOperator {

	public static void main(String[] args) {
		Animal23 Ani = new Lion24();
		System.out.println(Ani instanceof Lion24);

	}

}
