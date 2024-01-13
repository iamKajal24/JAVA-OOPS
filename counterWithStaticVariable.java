package OOPS;

class counter1 {
	static int count = 0;

	counter1() {
		count++;
		System.out.println(count);
	}
}

public class counterWithStaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter1 c1 = new counter1();
		counter1 c2 = new counter1();
		counter1 c3 = new counter1();
		counter1 c4 = new counter1();
	}
}
