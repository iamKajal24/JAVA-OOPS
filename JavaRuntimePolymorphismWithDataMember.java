package javaOOPS;

class Bike24 {
	int speedlimit = 90;
}

class Honda extends Bike24 {
	int speedlimit = 150;
}

public class JavaRuntimePolymorphismWithDataMember {

	public static void main(String[] args) {

		Bike24 B = new Honda();
		System.out.println(B.speedlimit);
	}
}
