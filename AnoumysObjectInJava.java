package OOPS;

public class AnoumysObjectInJava {
	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is : " + fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnoumysObjectInJava().fact(5);
	}

}
