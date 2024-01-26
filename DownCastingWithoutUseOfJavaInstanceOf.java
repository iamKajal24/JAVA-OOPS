package OOPS;

class Animal {

}

class Tiger24 extends Animal {
	static void method(Animal a) {
		Tiger24 T = (Tiger24) a;
		System.out.println("OkDownCasting Performmed");
	}
}

public class DownCastingWithoutUseOfJavaInstanceOf {

	public static void main(String[] args) {
		Animal a = new Tiger24();
		Tiger24.method(a);
	}
}
