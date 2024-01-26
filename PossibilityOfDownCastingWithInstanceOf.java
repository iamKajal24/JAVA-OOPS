package OOPS;

class Animal1124 {

}

class Dog34 extends Animal1124 {
	static void method(Animal1124 a) {
		if (a instanceof Dog34) {
			Dog34 d = (Dog34) a;
			System.out.println("Ok DownCasting Performed");
		}
	}
}

public class PossibilityOfDownCastingWithInstanceOf {
	public static void main(String[] args) {
		Animal1124 a = new Dog34();
		Dog34.method(a);
	}
}