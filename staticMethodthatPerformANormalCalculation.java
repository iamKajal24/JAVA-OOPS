package OOPS;

class calculation {
	static int cube(int x) {
		return x * x * x;
	}
}
public class staticMethodthatPerformANormalCalculation {

	public static void main(String[] args) {
		int res = calculation.cube(6);
		System.out.println("Result is : " + res);
	}
}
